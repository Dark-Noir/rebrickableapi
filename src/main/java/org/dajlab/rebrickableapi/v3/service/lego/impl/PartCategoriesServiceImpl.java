package org.dajlab.rebrickableapi.v3.service.lego.impl;

import org.dajlab.rebrickableapi.v3.service.AbstractRebrickableService;
import org.dajlab.rebrickableapi.v3.service.lego.IPartCategoriesService;

public class PartCategoriesServiceImpl extends AbstractRebrickableService implements IPartCategoriesService {

	/**
	 * Uri.
	 */
	private static final String BASE_URI = "/lego/part_categories/";

	/**
	 * Constructor.
	 * 
	 * @param privateKey private key
	 */
	public PartCategoriesServiceImpl(String privateKey) {
		super(privateKey);
	}

}
