package com.gem.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.Cascade;

@XmlType
@XmlRootElement(namespace = "http://www.gem.com/schema")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "GEM")
public class Gem {

	@XmlTransient
	@Id
	@Column(name = "ID_GEM", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@XmlElement(required = true)
	@Column(name = "NAME", nullable = false)
	private String name;

	@XmlElement(required = true)
	@ManyToOne(targetEntity = Colour.class)
	@JoinColumn(name = "COLOUR")
	private Colour colour;

	@XmlElement
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gemStatsId.gem", cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	@Cascade( { org.hibernate.annotations.CascadeType.SAVE_UPDATE,
			org.hibernate.annotations.CascadeType.DELETE_ORPHAN })
	private Set<GemStats> gemStats;

	public Colour getColour() {
		return colour;
	}

	public Gem() {
	}

	public Gem(String name, Colour colour, Set<GemStats> gemStats) {
		this.name = name;
		this.colour = colour;
		this.gemStats = gemStats;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
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

	public Set<GemStats> getGemStats() {
		return gemStats;
	}

	public void setGemStats(Set<GemStats> gemStats) {
		this.gemStats = gemStats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gem other = (Gem) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
