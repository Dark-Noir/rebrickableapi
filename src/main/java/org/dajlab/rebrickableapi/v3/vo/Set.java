package org.dajlab.rebrickableapi.v3.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Set {

	/**
	 * Set number.
	 */
	@JsonProperty("set_num")
	private String setNumber;

	/**
	 * Set name.
	 */
	private String name;

	/**
	 * Set release year.
	 */
	private int year;

	/**
	 * Set theme id.
	 */
	@JsonProperty("theme_id")
	private int themeId;

	/**
	 * Set number of parts.
	 */
	@JsonProperty("num_parts")
	private int numberParts;

	/**
	 * Set image URL to Rebrickable.com page.
	 */
	@JsonProperty("set_img_url")
	private String setImageUrl;

	/**
	 * Set URL to Rebrickable.com page.
	 */
	@JsonProperty("set_url")
	private String setUrl;

	/**
	 * Set date of last modified.
	 */
	@JsonProperty("last_modified_dt")
	private String lastModifiedDt;

	/**
	 * @return the setNumber
	 */
	public String getSetNumber() {
		return setNumber;
	}

	/**
	 * @param setNumber the setNumber to set
	 */
	public void setSetNumber(String setNumber) {
		this.setNumber = setNumber;
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
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the themeId
	 */
	public int getThemeId() {
		return themeId;
	}

	/**
	 * @param themeId the themeId to set
	 */
	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}

	/**
	 * @return the numberParts
	 */
	public int getNumberParts() {
		return numberParts;
	}

	/**
	 * @param numberParts the numberParts to set
	 */
	public void setNumberParts(int numberParts) {
		this.numberParts = numberParts;
	}

	/**
	 * @return the setImageUrl
	 */
	public String getSetImageUrl() {
		return setImageUrl;
	}

	/**
	 * @param setImageUrl the setImageUrl to set
	 */
	public void setSetImageUrl(String setImageUrl) {
		this.setImageUrl = setImageUrl;
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
