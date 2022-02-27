package org.dajlab.rebrickableapi.v3.service;

import org.dajlab.rebrickableapi.v3.service.lego.IColorsService;
import org.dajlab.rebrickableapi.v3.service.lego.IElementsService;
import org.dajlab.rebrickableapi.v3.service.lego.ISetsService;
import org.dajlab.rebrickableapi.v3.service.lego.IThemesService;
import org.dajlab.rebrickableapi.v3.service.lego.impl.ColorsServiceImpl;
import org.dajlab.rebrickableapi.v3.service.lego.impl.ElementsServiceImpl;
import org.dajlab.rebrickableapi.v3.service.lego.impl.SetsServiceImpl;
import org.dajlab.rebrickableapi.v3.service.lego.impl.ThemesServiceImpl;

public class RebrickableServiceImpl implements IRebrickableService {

	/**
	 * Colors service.
	 */
	private IColorsService colorsService;

	/**
	 * Elements service.
	 */
	private IElementsService elementsService;

	/**
	 * Sets service.
	 */
	private ISetsService setsService;

	/**
	 * Themes service.
	 */
	private IThemesService themesService;

	/**
	 * Constructor.
	 * 
	 * @param privateKey your Rebrickable private key.
	 */
	public RebrickableServiceImpl(String privateKey) {
		colorsService = new ColorsServiceImpl(privateKey);
		elementsService = new ElementsServiceImpl(privateKey);
		setsService = new SetsServiceImpl(privateKey);
		themesService = new ThemesServiceImpl(privateKey);
	}

	/**
	 * #{@inheritDoc}
	 */
	@Override
	public IColorsService getColors() {

		return colorsService;
	}

	/**
	 * #{@inheritDoc}
	 */
	@Override
	public IElementsService getElements() {

		return elementsService;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ISetsService getSets() {

		return setsService;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IThemesService getThemes() {

		return themesService;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setKey(String key) {
		colorsService.setKey(key);
		elementsService.setKey(key);
		setsService.setKey(key);
		themesService.setKey(key);
	}

}
