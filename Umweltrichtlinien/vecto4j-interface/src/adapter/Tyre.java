package adapter;

import java.io.Serializable;
import java.util.Map;

/**
 * Rollwiederstandsdaten von Reifen.
 */
public class Tyre implements Serializable {
	private static final long serialVersionUID = -1812180630925021666L;

	private int dryRollingResistance;
	private int wetRollingResistance;
	private Map<Temperature, Integer> rollingResistanceTemperatureMap;

	public int getDryRollingResistance() {
		return dryRollingResistance;
	}

	public void setDryRollingResistance(final int dryRollingResistance) {
		this.dryRollingResistance = dryRollingResistance;
	}

	public int getWetRollingResistance() {
		return wetRollingResistance;
	}

	public void setWetRollingResistance(final int wetRollingResistance) {
		this.wetRollingResistance = wetRollingResistance;
	}

	public Map<Temperature, Integer> getRollingResistanceTemperatureMap() {
		return rollingResistanceTemperatureMap;
	}

	public void setRollingResistanceTemperatureMap(final Map<Temperature, Integer> rollingResistanceTemperatureMap) {
		this.rollingResistanceTemperatureMap = rollingResistanceTemperatureMap;
	}
}
