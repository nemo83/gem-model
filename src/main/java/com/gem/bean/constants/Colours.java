package com.gem.bean.constants;

import java.util.HashMap;
import java.util.Map;

public enum Colours {

	RED("Red", 0), BLUE("Blue", 1), YELLOW("Yellow", 2), PURPLE("Purple", 3), GREEN(
			"Green", 4), ORANGE("Orange", 5), META("Meta", 6), SIMPLE("Simple",
			7), PRISMATIC("Prismatic", 8);

	private String name;
	private int wowheadId;

	Colours(String name, int wowheadId) {
		this.name = name;
		this.wowheadId = wowheadId;
	}

	private static Map<Integer, Colours> coloursSet = new HashMap<Integer, Colours>();

	static {
		for (Colours colour : Colours.values()) {
			coloursSet.put(colour.getWowheadId(), colour);
		}
	}

	public String getName() {
		return name;
	}

	public int getWowheadId() {
		return wowheadId;
	}

	public static Colours getStatByWowheadId(int wowheadId) {
		return coloursSet.get(wowheadId);
	}

}
