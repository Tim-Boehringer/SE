package de.dhbw.ka.se2.vecto4j.input;

import java.io.Serializable;
import java.util.List;

/**
 * Reibungsverluste in einem Getriebe.
 */
public class Gearbox implements Serializable {
	private static final long serialVersionUID = -6234986991906371645L;

	private int gears;
	private List<GearboxEfficienyEntry> gearboxEfficiency;

	public int getGears() {
		return gears;
	}

	public void setGears(final int gears) {
		this.gears = gears;
	}

	public List<GearboxEfficienyEntry> getGearboxEfficiency() {
		return gearboxEfficiency;
	}

	public void setGearboxEfficiency(final List<GearboxEfficienyEntry> gearboxEfficiency) {
		this.gearboxEfficiency = gearboxEfficiency;
	}
}
