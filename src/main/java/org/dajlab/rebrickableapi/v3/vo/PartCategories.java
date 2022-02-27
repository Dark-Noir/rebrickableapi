package org.dajlab.rebrickableapi.v3.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartCategories {

	/**
	 * Category Id
	 */
	private int id;

	/**
	 * Category name
	 */
	private String name;

	/**
	 * Category part count
	 */
	@JsonProperty("part_count")
	private int partCount;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the partCount
	 */
	public int getPartCount() {
		return partCount;
	}

	/**
	 * @param partCount the partCount to set
	 */
	public void setPartCount(int partCount) {
		this.partCount = partCount;
	}

}
