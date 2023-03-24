package adapter;

import java.io.Serializable;
import java.util.List;

/**
 * Effizienz- und Leistungsdaten eines Motors.
 */
public class Motor implements Serializable {
	private static final long serialVersionUID = 2918089577570768718L;

	private int maxTorque;
	private List<MotorEfficiencyEntry> efficiency;

	public int getMaxTorque() {
		return maxTorque;
	}

	public void setMaxTorque(final int maxTorque) {
		this.maxTorque = maxTorque;
	}

	public List<MotorEfficiencyEntry> getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(final List<MotorEfficiencyEntry> efficiency) {
		this.efficiency = efficiency;
	}
}
