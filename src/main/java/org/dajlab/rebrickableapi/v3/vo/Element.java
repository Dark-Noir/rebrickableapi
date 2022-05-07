package org.dajlab.rebrickableapi.v3.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Element implements Serializable {

	/**
	 * Part.
	 */
	private Part part;

	/**
	 * Color.
	 */
	private Color color;

	/**
	 * Element Id.
	 */
	@JsonProperty("element_id")
	private String elementId;

	/**
	 * Design Id.
	 */
	@JsonProperty("design_id")
	private String designId;

	/**
	 * Element image URL to Rebrickable.com page.
	 */
	@JsonProperty("element_img_url")
	private String elementImgUrl;

	/**
	 * Part image URL to Rebrickable.com page.
	 */
	@JsonProperty("part_img_url")
	private String partImgUrl;

	/**
	 * @return the part
	 */
	public Part getPart() {
		return part;
	}

	/**
	 * @param part the part to set
	 */
	public void setPart(Part part) {
		this.part = part;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the elementId
	 */
	public String getElementId() {
		return elementId;
	}

	/**
	 * @param elementId the elementId to set
	 */
	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	/**
	 * @return the designId
	 */
	public String getDesignId() {
		return designId;
	}

	/**
	 * @param designId the designId to set
	 */
	public void setDesignId(String designId) {
		this.designId = designId;
	}

	/**
	 * @return the elementImgUrl
	 */
	public String getElementImgUrl() {
		return elementImgUrl;
	}

	/**
	 * @param elementImgUrl the elementImgUrl to set
	 */
	public void setElementImgUrl(String elementImgUrl) {
		this.elementImgUrl = elementImgUrl;
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

}
