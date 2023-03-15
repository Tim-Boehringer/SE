package de.dhbw.ka.se2.vecto4j.input;

import java.io.Serializable;
import java.util.Objects;

public class Temperature implements Serializable {
	private static final long serialVersionUID = 6685284408292648016L;

	private double celsius;

	public Temperature createFromCelsius(final double celsius) {
		return new Temperature(celsius);
	}

	public Temperature createFromFahrenheit(final double fahrenheit) {
		return new Temperature(celsiusFromFahrenheit(fahrenheit));
	}

	public double celsiusValue() {
		return celsius;
	}

	public double fahrenheitValue() {
		return fahrenheitFromCelsius(celsius);
	}

	@Override
	public int hashCode() {
		return Objects.hash(celsius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temperature other = (Temperature) obj;
		return Double.doubleToLongBits(celsius) == Double.doubleToLongBits(other.celsius);
	}

	private Temperature(double celsius) {
		this.celsius = celsius;
	}

	private static double fahrenheitFromCelsius(double celsius) {
		return celsius * 1.8 + 32;
	}

	private static double celsiusFromFahrenheit(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}
}
