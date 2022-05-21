package org.dajlab.rebrickableapi.v3.service.lego;

import org.dajlab.rebrickableapi.v3.vo.RebrickableException;
import org.dajlab.rebrickableapi.v3.vo.Themes;

public interface IThemesService extends IService {

	Themes[] getAllThemes() throws RebrickableException;

}
