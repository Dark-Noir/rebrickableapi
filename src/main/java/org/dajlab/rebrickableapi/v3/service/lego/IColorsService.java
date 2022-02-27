package org.dajlab.rebrickableapi.v3.service.lego;

import org.dajlab.rebrickableapi.v3.vo.Color;
import org.dajlab.rebrickableapi.v3.vo.RebrickableException;

/**
 * Service for LEGO elements /api/v3/lego/colors/.
 * 
 *
 */
public interface IColorsService extends IService {

	/**
	 * Get details about all Colors.
	 * 
	 * @see <a href=
	 *      "https://rebrickable.com/api/v3/swagger/#!/lego/lego_colors_list">lego/colors/</a>
	 * @param
	 * @return all Colors
	 * @throws RebrickableException exception
	 */
	Color[] getAllColors() throws RebrickableException;
}