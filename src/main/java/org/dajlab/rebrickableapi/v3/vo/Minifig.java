package org.dajlab.rebrickableapi.v3.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Minifig {

	/**
	 * Minifig Id.
	 */
	@JsonProperty("set_num")
	private String setNum;

	/**
	 * Minifig name.
	 */
	private String name;

	/**
	 * Minifig number of parts.
	 */
	@JsonProperty("num_parts")
	private int numParts;

	/**
	 * Minifig image URL to Rebrickable.com page.
	 */
	@JsonProperty("set_img_url")
	private String setImgUrl;

	/**
	 * Minfig URL to Rebrickable.com page.
	 */
	@JsonProperty("set_url")
	private String setUrl;

	/**
	 * Minfig date of last modified.
	 */
	@JsonProperty("last_modified_dt")
	private String lastModifiedDt;

	/**
	 * @return the setNum
	 */
	public String getSetNum() {
		return setNum;
	}

	/**
	 * @param setNum the setNum to set
	 */
	public void setSetNum(String setNum) {
		this.setNum = setNum;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numParts
	 */
	public int getNumParts() {
		return numParts;
	}

	/**
	 * @param numParts the numParts to set
	 */
	public void setNumParts(int numParts) {
		this.numParts = numParts;
	}

	/**
	 * @return the setImgUrl
	 */
	public String getSetImgUrl() {
		return setImgUrl;
	}

	/**
	 * @param setImgUrl the setImgUrl to set
	 */
	public void setSetImgUrl(String setImgUrl) {
		this.setImgUrl = setImgUrl;
	}

	/**
	 * @return the setUrl
	 */
	public String getSetUrl() {
		return setUrl;
	}

	/**
	 * @param setUrl the setUrl to set
	 */
	public void setSetUrl(String setUrl) {
		this.setUrl = setUrl;
	}

	/**
	 * @return the lastModifiedDt
	 */
	public String getLastModifiedDt() {
		return lastModifiedDt;
	}

	/**
	 * @param lastModifiedDt the lastModifiedDt to set
	 */
	public void setLastModifiedDt(String lastModifiedDt) {
		this.lastModifiedDt = lastModifiedDt;
	}

}
