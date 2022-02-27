package org.dajlab.rebrickableapi.v3.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalId {

	/**
	 * External Ids.
	 */
	@JsonProperty("ext_ids")
	private Integer[] extIds;

	/**
	 * External descriptions.
	 */
	@JsonProperty("ext_descrs")
	private String[][] extDescrs;

	/**
	 * @return the extIds
	 */
	public Integer[] getExtIds() {
		return extIds;
	}

	/**
	 * @param extIds the extIds to set
	 */
	public void setExtIds(Integer[] extIds) {
		this.extIds = extIds;
	}

	/**
	 * @return the extDescrs
	 */
	public String[][] getExtDescrs() {
		return extDescrs;
	}

	/**
	 * @param extDescrs the extDescrs to set
	 */
	public void setExtDescrs(String[][] extDescrs) {
		this.extDescrs = extDescrs;
	}
}
