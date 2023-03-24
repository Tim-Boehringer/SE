package adapter;

import java.io.Serializable;

public class MotorEfficiencyEntry implements Serializable {
	private static final long serialVersionUID = -427405415800247169L;

	private int rotations;
	private int torque;
	private int loss;

	public int getRotations() {
		return rotations;
	}

	public void setRotations(final int rotations) {
		this.rotations = rotations;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(final int torque) {
		this.torque = torque;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(final int loss) {
		this.loss = loss;
	}
}
