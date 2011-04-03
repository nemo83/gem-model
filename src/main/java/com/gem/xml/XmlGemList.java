package com.gem.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.gem.model.Gem;

@XmlRootElement(namespace = "http://www.gem.com/schema")
public class XmlGemList {

	private List<Gem> gemList;
	
	@XmlElement(name = "gem")
	public List<Gem> getGemList() {
		return gemList;
	}

	public void setGemList(List<Gem> gemList) {
		this.gemList = gemList;
	}

}
