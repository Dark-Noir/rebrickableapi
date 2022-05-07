package org.dajlab.rebrickableapi.v3.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Part implements Serializable {

	/**
	 * Part number.
	 */
	@JsonProperty("part_num")
	private String partNum;

	/**
	 * Part name.
	 */
	private String name;

	/**
	 * Part category Id.
	 */
	@JsonProperty("part_cat_id")
	private String partCatId;

	/**
	 * Part first production year.
	 */
	@JsonProperty("year_from")
	private String yearFrom;

	/**
	 * Part last production year.
	 */
	@JsonProperty("year_to")
	private String yearTo;

	/**
	 * Part URL to Rebrickable.com page.
	 */
	@JsonProperty("part_url")
	private String partUrl;

	/**
	 * Part image URL to Rebrickable.com page.
	 */
	@JsonProperty("part_img_url")
	private String partImgUrl;

	/**
	 * Alternate part numbers with prints.
	 */
	private String[] prints;

	/**
	 * Alternate molds for the part.
	 */
	private String[] molds;

	/**
	 * Alternate parts for the part.
	 */
	private String[] alternates;

	/**
	 * Externals Ids for Bricklink etc..
	 */
	@JsonProperty("external_ids")
	private PartExternalIds externalIds;

	/**
	 * Printed part of.
	 */
	@JsonProperty("print_of")
	private String printOf;

	/**
	 * @return the partNum
	 */
	public String getPartNum() {
		return partNum;
	}

	/**
	 * @param partNum the partNum to set
	 */
	public void setPartNum(String partNum) {
		this.partNum = partNum;
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
	 * @return the partCatId
	 */
	public String getPartCatId() {
		return partCatId;
	}

	/**
	 * @param partCatId the partCatId to set
	 */
	public void setPartCatId(String partCatId) {
		this.partCatId = partCatId;
	}

	/**
	 * @return the yearFrom
	 */
	public String getYearFrom() {
		return yearFrom;
	}

	/**
	 * @param yearFrom the yearFrom to set
	 */
	public void setYearFrom(String yearFrom) {
		this.yearFrom = yearFrom;
	}

	/**
	 * @return the yearTo
	 */
	public String getYearTo() {
		return yearTo;
	}

	/**
	 * @param yearTo the yearTo to set
	 */
	public void setYearTo(String yearTo) {
		this.yearTo = yearTo;
	}

	/**
	 * @return the partUrl
	 */
	public String getPartUrl() {
		return partUrl;
	}

	/**
	 * @param partUrl the partUrl to set
	 */
	public void setPartUrl(String partUrl) {
		this.partUrl = partUrl;
	}

	/**
	 * @return the partImgUrl
	 */
	public String getPartImgUrl() {
		return partImgUrl;
	}

	/**
	 * @param partImgUrl the partImgUrl to set
	 */
	public void setPartImgUrl(String partImgUrl) {
		this.partImgUrl = partImgUrl;
	}

	/**
	 * @return the prints
	 */
	public String[] getPrints() {
		return prints;
	}

	/**
	 * @param prints the prints to set
	 */
	public void setPrints(String[] prints) {
		this.prints = prints;
	}

	/**
	 * @return the molds
	 */
	public String[] getMolds() {
		return molds;
	}

	/**
	 * @param molds the molds to set
	 */
	public void setMolds(String[] molds) {
		this.molds = molds;
	}

	/**
	 * @return the alternates
	 */
	public String[] getAlternates() {
		return alternates;
	}

	/**
	 * @param alternates the alternates to set
	 */
	public void setAlternates(String[] alternates) {
		this.alternates = alternates;
	}

	/**
	 * @return the externalIds
	 */
	public PartExternalIds getExternalIds() {
		return externalIds;
	}

	/**
	 * @param externalIds the externalIds to set
	 */
	public void setExternalIds(PartExternalIds externalIds) {
		this.externalIds = externalIds;
	}

	/**
	 * @return the printOf
	 */
	public String getPrintOf() {
		return printOf;
	}

	/**
	 * @param printOf the printOf to set
	 */
	public void setPrintOf(String printOf) {
		this.printOf = printOf;
	}

}
