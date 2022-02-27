package org.dajlab.rebrickableapi.v3.service.lego.impl;

import org.dajlab.rebrickableapi.v3.service.AbstractRebrickableService;
import org.dajlab.rebrickableapi.v3.service.lego.IThemesService;

public class ThemesServiceImpl extends AbstractRebrickableService implements IThemesService {

	/**
	 * Uri.
	 */
	private static final String BASE_URI = "/lego/themes/";

	/**
	 * Constructor.
	 * 
	 * @param privateKey private key
	 */
	public ThemesServiceImpl(String privateKey) {
		super(privateKey);
	}

}
