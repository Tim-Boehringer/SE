package plugins;

import java.io.Serializable;
import java.util.List;

import adapter.Airdrag;
import adapter.Axle;
import adapter.Battery;
import adapter.Gearbox;
import adapter.Motor;
import adapter.VehicleType;

/**
 * Eingabedaten des Fahrzeugs.
 * 
 * @author Peter Schuller
 */
public class VehicleInput implements Serializable {
	private static final long serialVersionUID = -4866019035307022665L;

	private VehicleType type;
	private Airdrag airdrag;
	private List<Axle> axles;
	private List<Battery> batteries;
	private Gearbox gearbox;
	private List<Motor> motors;
	private double weight;
	private double maxPermissibleWeight;

	public Airdrag getAirdrag() {
		return airdrag;
	}

	public void setAirdrag(final Airdrag airdrag) {
		this.airdrag = airdrag;
	}

	public List<Axle> getAxles() {
		return axles;
	}

	public void setAxles(final List<Axle> axles) {
		this.axles = axles;
	}

	public List<Battery> getBatteries() {
		return batteries;
	}

	public void setBatteries(final List<Battery> batteries) {
		this.batteries = batteries;
	}

	public Gearbox getGearbox() {
		return gearbox;
	}

	public void setGearbox(final Gearbox gearbox) {
		this.gearbox = gearbox;
	}

	public List<Motor> getMotors() {
		return motors;
	}

	public void setMotors(final List<Motor> motors) {
		this.motors = motors;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(final double weight) {
		this.weight = weight;
	}

	public double getMaxPermissibleWeight() {
		return maxPermissibleWeight;
	}

	public void setMaxPermissibleWeight(final double maxPermissibleWeight) {
		this.maxPermissibleWeight = maxPermissibleWeight;
	}
}
