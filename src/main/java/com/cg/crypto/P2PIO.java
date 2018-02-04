package com.cg.crypto;
import com.cg.SSS.SharesSet;

import java.util.*;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedTransferQueue;


public class P2PIO {

	private LinkedTransferQueue downloadQueue;
	private DelayQueue uploadQueue;

	/**
	 * 
	 * @param share
	 */
	public boolean upload(SharesSet share) {
		// TODO - implement P2PIO.upload
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param shareid
	 */
	public SharesSet download(String shareid) {
		// TODO - implement P2PIO.download
		throw new UnsupportedOperationException();
	}

	public DHT downloadDHT() {
		// TODO - implement P2PIO.downloadDHT
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sharesset
	 */
	public SharesSet generateDuplicates(SharesSet sharesset) {
		// TODO - implement P2PIO.generateDuplicates
		throw new UnsupportedOperationException();
	}

}