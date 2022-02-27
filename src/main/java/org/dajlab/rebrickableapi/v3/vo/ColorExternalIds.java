package org.dajlab.rebrickableapi.v3.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ColorExternalIds {

	/**
	 * Bricklink ID.
	 */
	@JsonProperty("BrickLink")
	private ExternalId bricklink;

	/**
	 * BrickOwl ID.
	 */
	@JsonProperty("BrickOwl")
	private ExternalId brickowl;

	/**
	 * LEGO ID.
	 */
	@JsonProperty("LEGO")
	private ExternalId lego;

	/**
	 * Peeron ID.
	 */
	@JsonProperty("Peeron")
	private ExternalId peeron;

	/**
	 * LDraw ID.
	 */
	@JsonProperty("LDraw")
	private ExternalId ldraw;

	/**
	 * @return the bricklink
	 */
	public ExternalId getBricklink() {
		return bricklink;
	}

	/**
	 * @param bricklink the bricklink to set
	 */
	public void setBricklink(ExternalId bricklink) {
		this.bricklink = bricklink;
	}

	/**
	 * @return the brickowl
	 */
	public ExternalId getBrickowl() {
		return brickowl;
	}

	/**
	 * @param brickowl the brickowl to set
	 */
	public void setBrickowl(ExternalId brickowl) {
		this.brickowl = brickowl;
	}

	/**
	 * @return the lego
	 */
	public ExternalId getLego() {
		return lego;
	}

	/**
	 * @param lego the lego to set
	 */
	public void setLego(ExternalId lego) {
		this.lego = lego;
	}

	/**
	 * @return the peeron
	 */
	public ExternalId getPeeron() {
		return peeron;
	}

	/**
	 * @param peeron the peeron to set
	 */
	public void setPeeron(ExternalId peeron) {
		this.peeron = peeron;
	}

	/**
	 * @return the ldraw
	 */
	public ExternalId getLdraw() {
		return ldraw;
	}

	/**
	 * @param ldraw the ldraw to set
	 */
	public void setLdraw(ExternalId ldraw) {
		this.ldraw = ldraw;
	}

}
