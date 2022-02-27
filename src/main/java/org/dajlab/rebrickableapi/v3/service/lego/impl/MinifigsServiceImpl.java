package org.dajlab.rebrickableapi.v3.service.lego.impl;

import org.dajlab.rebrickableapi.v3.service.AbstractRebrickableService;
import org.dajlab.rebrickableapi.v3.service.lego.IMinifigsService;

public class MinifigsServiceImpl extends AbstractRebrickableService implements IMinifigsService {

	/**
	 * Uri.
	 */
	private static final String BASE_URI = "/lego/minifigs/";

	/**
	 * Constructor.
	 * 
	 * @param privateKey private key
	 */
	public MinifigsServiceImpl(String privateKey) {
		super(privateKey);
	}

}
