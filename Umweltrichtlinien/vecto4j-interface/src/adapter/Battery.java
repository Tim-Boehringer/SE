package adapter;

import java.io.Serializable;
import java.util.Map;

/**
 * Daten zu Batterien.
 */
public class Battery implements Serializable {
	private static final long serialVersionUID = 6563705944997397266L;

	private double maxCapacity;
	private double minChargingState;
	private double maxChargingState;
	private double agingFactor;
	private Map<Temperature, Double> chargingEfficiencyMap;

	public double getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(final double maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public double getMinChargingState() {
		return minChargingState;
	}

	public void setMinChargingState(final double minChargingState) {
		this.minChargingState = minChargingState;
	}

	public double getMaxChargingState() {
		return maxChargingState;
	}

	public void setMaxChargingState(final double maxChargingState) {
		this.maxChargingState = maxChargingState;
	}

	public double getAgingFactor() {
		return agingFactor;
	}

	public void setAgingFactor(final double agingFactor) {
		this.agingFactor = agingFactor;
	}

	public Map<Temperature, Double> getChargingEfficiencyMap() {
		return chargingEfficiencyMap;
	}

	public void setChargingEfficiencyMap(final Map<Temperature, Double> chargingEfficiencyMap) {
		this.chargingEfficiencyMap = chargingEfficiencyMap;
	}
}
