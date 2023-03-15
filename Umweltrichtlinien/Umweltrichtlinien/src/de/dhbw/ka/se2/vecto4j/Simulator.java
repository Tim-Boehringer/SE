package de.dhbw.ka.se2.vecto4j;

import de.dhbw.ka.se2.vecto4j.input.VehicleInput;
import de.dhbw.ka.se2.vecto4j.output.ElectricVehicleSimulationResult;

/**
 * Mock einer Simulation für CO2 Werte von schweren Nutzfahrzeugen. Erstellt für
 * die Nutzung im Rahmen der Vorlesung SE2: Softwarearchitektur an der DHBW
 * Karlsruhe.
 * 
 * @author Peter Schuller
 */
public interface Simulator {

	/**
	 * Startet die Simulation eines Fahrzeugs.
	 */
	public ElectricVehicleSimulationResult calculateVehicle(final VehicleInput vehicle) throws IncompleteVehicleException, WrongVehicleClassException;
}
