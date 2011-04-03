package com.gem.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlTransient
@Embeddable
public class GemStatsId implements Serializable {

	private static final long serialVersionUID = -724737917342650468L;

	@ManyToOne
	private Gem gem;

	@ManyToOne
	private Stat stat;

	public Gem getGem() {
		return gem;
	}

	public void setGem(Gem gem) {
		this.gem = gem;
	}

	public Stat getStat() {
		return stat;
	}

	public void setStat(Stat stat) {
		this.stat = stat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gem == null) ? 0 : gem.hashCode());
		result = prime * result + ((stat == null) ? 0 : stat.hashCode());
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
		GemStatsId other = (GemStatsId) obj;
		if (gem == null) {
			if (other.gem != null)
				return false;
		} else if (!gem.equals(other.gem))
			return false;
		if (stat == null) {
			if (other.stat != null)
				return false;
		} else if (!stat.equals(other.stat))
			return false;
		return true;
	}

}
