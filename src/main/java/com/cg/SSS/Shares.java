package com.cg.SSS;

import javafx.util.Pair;

import java.io.*;
import java.util.*;
public class Shares {


	private Pair<Integer, Integer> point;
	private byte[] digest;
	private byte[] message;
	private String hostid;

	/**
	 * 
	 * @param digest
	 */
	public void setDigest(byte[] digest) {
		this.digest = digest;
	}

	public byte[] getDigest() {
		return this.digest;
	}

	/**
	 * 
	 * @param message
	 * @param point
	 */
	public Shares(byte[] message, Pair<Integer, Integer> point) {
		// TODO - implement SSS.Shares.SSS.Shares
		throw new UnsupportedOperationException();
	}

	public Pair<Integer, Integer> getPoint() {
		return this.point;
	}

	public byte[] getMessage() {
		return this.message;
	}

	public String getHostId() {
		// TODO - implement SSS.Shares.getHostId
		throw new UnsupportedOperationException();

	}

	/**
	 * 
	 * @param hostId
	 */
	public void setHostId(String hostId) {
		// TODO - implement SSS.Shares.setHostId
		throw new UnsupportedOperationException();
	}

}