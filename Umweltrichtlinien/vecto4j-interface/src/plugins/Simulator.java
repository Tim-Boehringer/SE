package plugins;

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
