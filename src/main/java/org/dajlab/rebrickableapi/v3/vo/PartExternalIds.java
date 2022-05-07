package org.dajlab.rebrickableapi.v3.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartExternalIds implements Serializable {

	/**
	 * Bricklink ID.
	 */
	@JsonProperty("BrickLink")
	private String[] bricklink;

	/**
	 * BrickOwl ID.
	 */
	@JsonProperty("BrickOwl")
	private String[] brickowl;

	/**
	 * Brickset ID.
	 */
	@JsonProperty("Brickset")
	private String[] brickset;

	/**
	 * LEGO ID.
	 */
	@JsonProperty("LEGO")
	private String[] lego;

	/**
	 * Peeron ID.
	 */
	@JsonProperty("Peeron")
	private String[] peeron;

	/**
	 * LDraw ID.
	 */
	@JsonProperty("LDraw")
	private String[] ldraw;

	/**
	 * @return the bricklink
	 */
	public String[] getBricklink() {
		return bricklink;
	}

	/**
	 * @param bricklink the bricklink to set
	 */
	public void setBricklink(String[] bricklink) {
		this.bricklink = bricklink;
	}

	/**
	 * @return the brickowl
	 */
	public String[] getBrickowl() {
		return brickowl;
	}

	/**
	 * @param brickowl the brickowl to set
	 */
	public void setBrickowl(String[] brickowl) {
		this.brickowl = brickowl;
	}

	/**
	 * @return the brickset
	 */
	public String[] getBrickset() {
		return brickset;
	}

	/**
	 * @param brickset the brickset to set
	 */
	public void setBrickset(String[] brickset) {
		this.brickset = brickset;
	}

	/**
	 * @return the lego
	 */
	public String[] getLego() {
		return lego;
	}

	/**
	 * @param lego the lego to set
	 */
	public void setLego(String[] lego) {
		this.lego = lego;
	}

	/**
	 * @return the peeron
	 */
	public String[] getPeeron() {
		return peeron;
	}

	/**
	 * @param peeron the peeron to set
	 */
	public void setPeeron(String[] peeron) {
		this.peeron = peeron;
	}

	/**
	 * @return the ldraw
	 */
	public String[] getLdraw() {
		return ldraw;
	}

	/**
	 * @param ldraw the ldraw to set
	 */
	public void setLdraw(String[] ldraw) {
		this.ldraw = ldraw;
	}
}
