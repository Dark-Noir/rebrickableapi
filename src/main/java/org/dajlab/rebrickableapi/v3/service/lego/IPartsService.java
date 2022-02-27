package org.dajlab.rebrickableapi.v3.service.lego;

import org.dajlab.rebrickableapi.v3.vo.Part;
import org.dajlab.rebrickableapi.v3.vo.RebrickableException;

/**
 * Service for LEGO parts /api/v3/lego/parts/.
 * 
 *
 */
public interface IPartsService extends IService {

	/**
	 * Get details about Parts.
	 * 
	 * @see <a href=
	 *      "https://rebrickable.com/api/v3/swagger/#!/lego/lego_parts_list"">lego/parts/</a>
	 * @param
	 * @return Parts
	 * @throws RebrickableException exception
	 */
	Part[] getAllParts() throws RebrickableException;

	Part[] getPartByNum(String partNum) throws RebrickableException;

	Part[] getPartByCatId(String catId) throws RebrickableException;

	Part[] getPartByColorId(String colorId) throws RebrickableException;

	Part[] getPartByBricklinkId(String bricklinkId) throws RebrickableException;

	Part[] getPartByBrickowlId(String brickowlId) throws RebrickableException;

	Part[] getPartByLegoId(String legoId) throws RebrickableException;

	Part[] getPartByLdrawId(String ldrawID) throws RebrickableException;

	Part[] getPartBySearch(String search) throws RebrickableException;

}
