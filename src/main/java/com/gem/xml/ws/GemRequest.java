package com.gem.xml.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "http://www.gem.com/schema")
@XmlType
public class GemRequest {

	private String gemName;

	@XmlElement
	public String getGemName() {
		return gemName;
	}

	public void setGemName(String gemName) {
		this.gemName = gemName;
	}

}
