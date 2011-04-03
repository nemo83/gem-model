package com.gem.xml.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.gem.model.Gem;

@XmlType
@XmlRootElement(namespace = "http://www.gem.com/schema")
public class GemResponse {

	private Gem gem;

	@XmlElement
	public Gem getGem() {
		return gem;
	}

	public void setGem(Gem gem) {
		this.gem = gem;
	}
	

}
