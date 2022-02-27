package org.dajlab.rebrickableapi.v3.service.lego.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.dajlab.rebrickableapi.v3.enumeration.Method;
import org.dajlab.rebrickableapi.v3.service.AbstractRebrickableService;
import org.dajlab.rebrickableapi.v3.service.lego.IPartsService;
import org.dajlab.rebrickableapi.v3.vo.Part;
import org.dajlab.rebrickableapi.v3.vo.RebrickableException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PartsServiceImpl extends AbstractRebrickableService implements IPartsService {

	/**
	 * Uri.
	 */
	private static final String BASE_URI = "/lego/parts/";

	/**
	 * Constructor.
	 * 
	 * @param privateKey private key
	 */
	public PartsServiceImpl(String privateKey) {
		super(privateKey);
	}

	@Override
	public Part[] getAllParts() throws RebrickableException {

		int newParts = 0;
		int pageSize = 1000;
		int currentPage = 1;
		String maxParts = "";

		ArrayList<Part> allParts = new ArrayList<Part>();

		do {

			String uri = BASE_URI;
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("page_size", "" + pageSize);
			map.put("page", "" + currentPage);
			map.put("inc_part_details", "1");

			String output = returnJsonResponse(Method.GET, uri, map);
			try {
				if (output != null) {
					JSONParser parser = new JSONParser();
					JSONObject json = (JSONObject) parser.parse(output);

					maxParts = (String) json.get("count").toString();
					output = (String) json.get("results").toString();

					ObjectMapper mapper = new ObjectMapper();

					Part[] readParts = mapper.readValue(output, Part[].class);

					allParts.addAll(Arrays.asList(readParts));
					newParts = readParts.length;
					currentPage++;

					System.out.println("Loaded new entries: " + readParts.length); // temp
				}
			} catch (Exception e) {
				throw new RebrickableException(e.getMessage());
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (newParts == pageSize);
		System.out.println(maxParts); // temp
		return (Part[]) allParts.toArray(new Part[allParts.size()]);
	}

	@Override
	public Part[] getPartByNum(String partNum) throws RebrickableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Part[] getPartByCatId(String catId) throws RebrickableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Part[] getPartByColorId(String colorId) throws RebrickableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Part[] getPartByBricklinkId(String bricklinkId) throws RebrickableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Part[] getPartByBrickowlId(String brickowlId) throws RebrickableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Part[] getPartByLegoId(String legoId) throws RebrickableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Part[] getPartByLdrawId(String ldrawID) throws RebrickableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Part[] getPartBySearch(String search) throws RebrickableException {
		// TODO Auto-generated method stub
		return null;
	}

}
