package de.dhbw.ka.se2.vecto4j.output;

import java.io.Serializable;
import java.util.List;

/**
 * Simulationsergebnis für ein elektrisches Fahrzeug.
 * 
 * @author Peter Schuller
 */
public class ElectricVehicleSimulationResult implements Serializable {
	private static final long serialVersionUID = -2532877229951518388L;

	private double specificRange;
	private double maxRange;
	private double minRange;
	private double specificConsumption;
	private List<EVScenarioResult> scenarios;

	public double getSpecificRange() {
		return specificRange;
	}

	public void setSpecificRange(final double specificRange) {
		this.specificRange = specificRange;
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

	public double getSpecificConsumption() {
		return specificConsumption;
	}

	public void setSpecificConsumption(final double specificConsumption) {
		this.specificConsumption = specificConsumption;
	}

	public List<EVScenarioResult> getScenarios() {
		return scenarios;
	}

	public void setScenarios(final List<EVScenarioResult> scenarios) {
		this.scenarios = scenarios;
	}
}
