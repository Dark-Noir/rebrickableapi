package org.dajlab.rebrickableapi.v3.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Color {

	/**
	 * ID of the color.
	 */
	private int id;

	/**
	 * Name of the color.
	 */
	private String name;

	/**
	 * RGB color of the color.
	 */
	private String rgb;

	/**
	 * Is color transparent.
	 */
	@JsonProperty("is_trans")
	private Boolean isTrans;

	/**
	 * Externals Ids.
	 */
	@JsonProperty("external_ids")
	private ColorExternalIds externalIds;

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
	 * @return the rgb
	 */
	public String getRgb() {
		return rgb;
	}

	/**
	 * @param rgb the rgb to set
	 */
	public void setRgb(String rgb) {
		this.rgb = rgb;
	}

	/**
	 * @return the isTrans
	 */
	public Boolean getIsTrans() {
		return isTrans;
	}

	/**
	 * @param isTrans the isTrans to set
	 */
	public void setIsTrans(Boolean isTrans) {
		this.isTrans = isTrans;
	}

	/**
	 * @return the externalIds
	 */
	public ColorExternalIds getExternalIds() {
		return externalIds;
	}

	/**
	 * @param externalIds the externalIds to set
	 */
	public void setExternalIds(ColorExternalIds externalIds) {
		this.externalIds = externalIds;
	}

}
