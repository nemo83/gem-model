package com.gem.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType
@Entity
@Table(name = "GEM_STATS")
@AssociationOverrides( {
		@AssociationOverride(name = "gemStatsId.gem", joinColumns = @JoinColumn(name = "id_gem")),
		@AssociationOverride(name = "gemStatsId.stat", joinColumns = @JoinColumn(name = "id_stat")) })
public class GemStats {

	@XmlTransient
	@EmbeddedId
	private GemStatsId gemStatsId = new GemStatsId();

	@Column(name = "STAT_VALUE", nullable = false)
	private int statValue;

	public int getStatValue() {
		return statValue;
	}

	public void setStatValue(int statValue) {
		this.statValue = statValue;
	}

	@XmlTransient
	@Transient
	public Gem getGem() {
		return getGemStatsId().getGem();
	}

	public void setGem(Gem gem) {
		getGemStatsId().setGem(gem);
	}

	@Transient
	public Stat getStat() {
		return getGemStatsId().getStat();
	}

	public void setStat(Stat stat) {
		getGemStatsId().setStat(stat);
	}

	@XmlTransient
	public GemStatsId getGemStatsId() {
		return gemStatsId;
	}

	public void setGemStatsId(GemStatsId gemStatsId) {
		this.gemStatsId = gemStatsId;
	}

}
