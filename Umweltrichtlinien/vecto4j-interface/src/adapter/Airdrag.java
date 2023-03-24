package adapter;

import java.io.Serializable;

/**
 * Luftwiederstandsdaten eines Fahrzeugs.
 */
public class Airdrag implements Serializable {
	private static final long serialVersionUID = -2576817960218595191L;

	private int area;
	private int cw;

	public int getArea() {
		return area;
	}

	public void setArea(final int area) {
		this.area = area;
	}

	public int getCw() {
		return cw;
	}

	public void setCw(final int cw) {
		this.cw = cw;
	}
}
