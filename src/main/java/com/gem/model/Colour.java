package com.gem.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(namespace = "http://www.gem.com/schema")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "COLOUR")
public class Colour {

	@XmlTransient
	@Id
	@Column(name = "ID_COLOUR", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@XmlElement(required = true)
	@Column(name = "NAME", nullable = false)
	private String name;

	@XmlElement(required = true)
	@Column(name = "WOWHEAD_ID", nullable = false)
	private int wowheadId;

	@XmlTransient
	@OneToMany(targetEntity = Gem.class, mappedBy = "colour")
	private Set<Gem> gem;

	public Colour() {
	}

	public Colour(String name) {
		this.name = name;
	}

	public Colour(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Colour(int wowheadId) {
		this.wowheadId = wowheadId;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Gem> getGem() {
		return gem;
	}

	public void setGem(Set<Gem> gem) {
		this.gem = gem;
	}

	public int getWowheadId() {
		return wowheadId;
	}

	public void setWowheadId(int wowheadId) {
		this.wowheadId = wowheadId;
	}

}
