package de.dhbw.ka.se2.vecto4j.output;

import java.io.Serializable;

/**
 * Simulationsergebnis für ein spezifisches Fahrszenario für ein elektrisches
 * Fahrzeug.
 * 
 * @author Peter Schuller
 */
public class EVScenarioResult implements Serializable {
	private static final long serialVersionUID = -2532877229951518388L;

	private double averageRange;
	private double maxRange;
	private double minRange;
	private double consumption;

	public double getAverageRange() {
		return averageRange;
	}

	public void setAverageRange(final double averageRange) {
		this.averageRange = averageRange;
	}

	public double getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(final double maxRange) {
		this.maxRange = maxRange;
	}

	public double getMinRange() {
		return minRange;
	}

	public void setMinRange(final double minRange) {
		this.minRange = minRange;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(final double consumption) {
		this.consumption = consumption;
	}
}
