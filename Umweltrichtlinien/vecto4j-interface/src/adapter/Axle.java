package adapter;

import java.io.Serializable;

/**
 * Daten zu Reibungsverlusten an einer Achse.
 */
public class Axle implements Serializable {
	private static final long serialVersionUID = -944429417980930112L;

	private boolean steered;
	private double maxSteeringAngle;
	private double rollingResistance;
	private int axlePosition;
	private Tyre tyres;
	private boolean hasDoubleTyres;

	public boolean isSteered() {
		return steered;
	}

	public void setSteered(final boolean steered) {
		this.steered = steered;
	}

	public double getMaxSteeringAngle() {
		return maxSteeringAngle;
	}

	public void setMaxSteeringAngle(final double maxSteeringAngle) {
		this.maxSteeringAngle = maxSteeringAngle;
	}

	public double getRollingResistance() {
		return rollingResistance;
	}

	public void setRollingResistance(final double rollingResistance) {
		this.rollingResistance = rollingResistance;
	}

	public int getAxlePosition() {
		return axlePosition;
	}

	public void setAxlePosition(final int axlePosition) {
		this.axlePosition = axlePosition;
	}

	public Tyre getTyres() {
		return tyres;
	}

	public void setTyres(final Tyre tyres) {
		this.tyres = tyres;
	}

	public boolean isHasDoubleTyres() {
		return hasDoubleTyres;
	}

	public void setHasDoubleTyres(final boolean hasDoubleTyres) {
		this.hasDoubleTyres = hasDoubleTyres;
	}
}
