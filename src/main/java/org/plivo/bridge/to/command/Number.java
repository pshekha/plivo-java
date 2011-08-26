package org.plivo.bridge.to.command;

/**
 * Copyright (c) 2011 Plivo Team. See LICENSE for details.
 *  2011-05-23
 * @author Paulo reis
 */

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Number implements Serializable {

	private static final long serialVersionUID = 158509162906138363L;
	
	@XmlAttribute
	private String sendDigits;
	
	@XmlAttribute
	private String url;
	
	@XmlAttribute
	private String gateways;	
	
	@XmlAttribute
	private String gatewayCodecs;
	
	@XmlAttribute
	private int gatewayTimeouts;
	
	@XmlAttribute
	private int gatewayRetries;
	
	@XmlAttribute
	private String extraDialString;
	
	@XmlValue
	private String number;
	
	public Number() {
		
	}

	public String getSendDigits() {
		return sendDigits;
	}

	/**
	 * Key to press after connecting to the number
	 * @param sendDigits
	 */
	public void setSendDigits(String sendDigits) {
		this.sendDigits = sendDigits;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGateways() {
		return gateways;
	}

	public void setGateways(String gateways) {
		this.gateways = gateways;
	}

	public String getGatewayCodecs() {
		return gatewayCodecs;
	}

	public void setGatewayCodecs(String gatewayCodecs) {
		this.gatewayCodecs = gatewayCodecs;
	}

	public int getGatewayTimeouts() {
		return gatewayTimeouts;
	}

	public void setGatewayTimeouts(int gatewayTimeouts) {
		this.gatewayTimeouts = gatewayTimeouts;
	}

	public int getGatewayRetries() {
		return gatewayRetries;
	}

	public void setGatewayRetries(int gatewayRetries) {
		this.gatewayRetries = gatewayRetries;
	}

	public String getExtraDialString() {
		return extraDialString;
	}

	public void setExtraDialString(String extraDialString) {
		this.extraDialString = extraDialString;
	}

	public String getNumber() {
		return number;
	}

	/**
	 * Phone number to dial
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}
}