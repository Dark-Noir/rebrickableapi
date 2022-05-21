package org.dajlab.rebrickableapi.v3.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartCategories implements Serializable {

	private static final long serialVersionUID = -5429444024383339259L;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the partCount
	 */
	public int getPartCount() {
		return partCount;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param partCount the partCount to set
	 */
	public void setPartCount(int partCount) {
		this.partCount = partCount;
	}

}
