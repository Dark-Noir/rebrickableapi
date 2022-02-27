package org.dajlab.rebrickableapi.v3.service;

import org.dajlab.rebrickableapi.v3.service.lego.IColorsService;
import org.dajlab.rebrickableapi.v3.service.lego.IElementsService;
import org.dajlab.rebrickableapi.v3.service.lego.IMinifigsService;
import org.dajlab.rebrickableapi.v3.service.lego.IPartCategoriesService;
import org.dajlab.rebrickableapi.v3.service.lego.IPartsService;
import org.dajlab.rebrickableapi.v3.service.lego.ISetsService;
import org.dajlab.rebrickableapi.v3.service.lego.IThemesService;

/**
 * Services for Rebrickable.com.
 * 
 * @see <a href="https://rebrickable.com/api/v3/docs/">API Doc</a>
 * 
 *
 */
public interface IRebrickableService {

	/**
	 * Colors service.
	 * 
	 * @return the colors service.
	 */
	IColorsService getColors();

	/**
	 * Elements service.
	 * 
	 * @return the elements service.
	 */
	IElementsService getElements();

	/**
	 * Minifigs service.
	 * 
	 * @return the minifigs service.
	 */
	IMinifigsService getMinifigs();

	/**
	 * Part categories service.
	 * 
	 * @return the part categories service.
	 */
	IPartCategoriesService getPartCategories();

	/**
	 * Parts service.
	 * 
	 * @return the parts service.
	 */
	IPartsService getParts();

	/**
	 * Sets service.
	 * 
	 * @return the sets service.
	 */
	ISetsService getSets();

	/**
	 * Themes service.
	 * 
	 * @return the themes service.
	 */
	IThemesService getThemes();

	/**
	 * Set the API key.
	 * 
	 * @param key key
	 */
	void setKey(String key);
}
