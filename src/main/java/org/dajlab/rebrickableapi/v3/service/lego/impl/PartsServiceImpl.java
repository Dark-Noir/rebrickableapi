package org.dajlab.rebrickableapi.v3.service.lego.impl;

import org.dajlab.rebrickableapi.v3.service.AbstractRebrickableService;
import org.dajlab.rebrickableapi.v3.service.lego.IPartsService;

public class PartsServiceImpl extends AbstractRebrickableService implements IPartsService {

	/**
	 * Uri.
	 */
	private static final String BASE_URI = "/lego/parts/";

	/**
	 * Constructor.
	 * 
	 * @param privateKey private key
	 */
	public PartsServiceImpl(String privateKey) {
		super(privateKey);
	}

}
