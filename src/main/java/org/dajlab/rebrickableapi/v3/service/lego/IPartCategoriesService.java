package org.dajlab.rebrickableapi.v3.service.lego;

import org.dajlab.rebrickableapi.v3.vo.PartCategories;
import org.dajlab.rebrickableapi.v3.vo.RebrickableException;

public interface IPartCategoriesService extends IService {

	PartCategories[] getAllPartCategories() throws RebrickableException;

}
