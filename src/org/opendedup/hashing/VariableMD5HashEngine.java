/*******************************************************************************
 * Copyright (C) 2016 Sam Silverberg sam.silverberg@gmail.com	
 *
 * This file is part of OpenDedupe SDFS.
 *
 * OpenDedupe SDFS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * OpenDedupe SDFS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package org.opendedup.hashing;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.opendedup.logging.SDFSLogger;
import org.opendedup.sdfs.Main;
import org.rabinfingerprint.handprint.BoundaryDetectors;
import org.rabinfingerprint.handprint.FingerFactory.ChunkBoundaryDetector;
import org.rabinfingerprint.handprint.EnhancedFingerFactory;
import org.rabinfingerprint.handprint.EnhancedFingerFactory.EnhancedChunkVisitor;
import org.rabinfingerprint.polynomial.Polynomial;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class VariableMD5HashEngine implements AbstractHashEngine {

	static Polynomial p = Polynomial.createFromLong(10923124345206883L);
	ChunkBoundaryDetector boundaryDetector = BoundaryDetectors.DEFAULT_BOUNDARY_DETECTOR;
	
	private EnhancedFingerFactory ff = null;
	HashFunction hf = Hashing.md5();

	public VariableMD5HashEngine() throws NoSuchAlgorithmException {
		while (ff == null) {
			SDFSLogger.getLog().info("Variable minLen=" +HashFunctionPool.minLen + " maxlen=" + HashFunctionPool.maxLen + " windowSize=" + HashFunctionPool.bytesPerWindow);
			ff = new EnhancedFingerFactory(p, HashFunctionPool.bytesPerWindow, boundaryDetector,
					HashFunctionPool.minLen, HashFunctionPool.maxLen);
		}

	}

	@Override
	public byte[] getHash(byte[] data) {
		byte[] hash = hf.hashBytes(data).asBytes();
		return hash;
	}
	
	

	public List<Finger> getChunks(byte [] data,String uuid) throws IOException {
		final ArrayList<Finger> al = new ArrayList<Finger>();
		ff.getChunkFingerprints(data, new EnhancedChunkVisitor() {
			public void visit(long fingerprint, long chunkStart, long chunkEnd,
					byte[] chunk) {
				byte[] hash = getHash(chunk);
				Finger f = new Finger(uuid);
				f.chunk = chunk;
				f.hash = hash;
				f.len = (int) (chunkEnd - chunkStart);
				f.start = (int) chunkStart;
				al.add(f);
			}
		});
		return al;
	}

	public static int getMaxCluster() {
		return Main.CHUNK_LENGTH / HashFunctionPool.minLen;
	}

	@Override
	public void destroy() {

	}
	
	@Override
	public boolean isVariableLength() {
		return true;
	}

	@Override
	public int getMaxLen() {
		return Main.CHUNK_LENGTH;
	}

	@Override
	public int getMinLen() {
		return HashFunctionPool.minLen;
	}

	@Override
	public void setSeed(int seed) {
		
		
	}
}
