package org.dajlab.rebrickableapi.v3.service.lego.impl;

import java.util.HashMap;

import org.dajlab.rebrickableapi.v3.enumeration.Method;
import org.dajlab.rebrickableapi.v3.service.AbstractRebrickableService;
import org.dajlab.rebrickableapi.v3.service.lego.IColorsService;
import org.dajlab.rebrickableapi.v3.vo.Color;
import org.dajlab.rebrickableapi.v3.vo.RebrickableException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ColorsServiceImpl extends AbstractRebrickableService implements IColorsService {

	/**
	 * Uri.
	 */
	private static final String BASE_URI = "/lego/colors/";

	/**
	 * Constructor.
	 * 
	 * @param privateKey private key
	 */
	public ColorsServiceImpl(String privateKey) {
		super(privateKey);
	}

	@Override
	public Color[] getAllColors() throws RebrickableException {

		String uri = BASE_URI;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("page_size", "1000");
		String output = returnJsonResponse(Method.GET, uri, map);
		try {
			if (output != null) {
				JSONParser parser = new JSONParser();
				JSONObject json = (JSONObject) parser.parse(output);
				output = (String) json.get("results").toString();

				ObjectMapper mapper = new ObjectMapper();

				return mapper.readValue(output, Color[].class);
			}
		} catch (Exception e) {
			throw new RebrickableException(e.getMessage());
		}
		return null;
	}

}
