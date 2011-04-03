package com.gem.bean.constants;

import java.util.HashMap;
import java.util.Map;

public enum WowStats {

	CRITICAL_STRIKE_RATING("Critical Strike Rating", "critstrkrtng"), SPELL_PENETRATION(
			"Spell penetration", "splpen"), STRENGTH("Strength", "str"), AGILITY(
			"Agility", "agi"), STAMINA("Stamina", "sta"), INTELLECT(
			"Intellect", "int"), SPIRIT("Spirit", "spi"), HASTE_RATING(
			"Haste rating", "hastertng"), HOLY_RESISTENCE("Holy Resistence",
			"holres"), FIRE_RESISTENCE("Fire resistence", "firres"), NATURE_RESISTENCE(
			"Nature resistence", "natres"), FROST_RESISTENCE(
			"Frost resistence", "frores"), SHADOW_RESISTENCE(
			"Shadow resistence", "shares"), ARCANE_RESISTENCE(
			"Arcane resistence", "arcres"), HIT_RATING("Hit rating", "hitrtng"), MANA_REGENERATION(
			"Mana regeneration", "manargn"), RESILIENCE_RATING(
			"Resilience rating", "resirtng"), SPELL_POWER("Spell power",
			"splpwr"), DEFENCE_RATING("Defence rating", "defrtng"), DODGE_RATING(
			"Dodge rating", "dodgertng"), EXPERTISE_RATING("Expertise rating",
			"exprtng"), PARRY_RATING("Parry rating", "parryrtng"), ATTACK_POWER(
			"Attack power", "atkpwr"), ARMOR_PENETRATION("Armor penetration",
			"armorpenrtng");

	private String name, shortName;

	private static Map<String, WowStats> statsSet = new HashMap<String, WowStats>();

	static {
		for (WowStats stat : WowStats.values()) {
			statsSet.put(stat.getShortName(), stat);
		}
	}

	WowStats(String name, String shortName) {
		this.name = name;
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public String getShortName() {
		return shortName;
	}
	
	public static WowStats getStatByShortDescr(String shortDescr) {
		return statsSet.get(shortDescr);
	}

}
