package de.dhbw.ka.se2.vecto4j.input;

import java.io.Serializable;

public class GearboxEfficienyEntry implements Serializable {
	private static final long serialVersionUID = 3502508107842362019L;

	private int gear;
	private int rotations;
	private int loss;

	public int getGear() {
		return gear;
	}

	public void setGear(final int gear) {
		this.gear = gear;
	}

	public int getRotations() {
		return rotations;
	}

	public void setRotations(final int rotations) {
		this.rotations = rotations;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(final int loss) {
		this.loss = loss;
	}
}
