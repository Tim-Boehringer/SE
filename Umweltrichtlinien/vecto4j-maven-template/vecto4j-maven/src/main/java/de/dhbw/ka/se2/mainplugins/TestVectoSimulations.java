package de.dhbw.ka.se2.mainplugins;

import com.ctc.wstx.shaded.msv_core.grammar.xmlschema.Field;

import de.dhbw.ka.se2.application.print.VehicleConfigGenerator;
import de.dhbw.ka.se2.application.vecto.Co2SimulationProcess;
import de.dhbw.ka.se2.application.vecto.VehicleWeightsClient;
import de.dhbw.ka.se2.domain.print.FullVehicle;
import de.dhbw.ka.se2.domain.print.VehicleConfiguration;
import de.dhbw.ka.se2.domain.print.VehicleConfigurationMetadata;
import de.dhbw.ka.se2.plugin.logistics.LogisticsClient;
import de.dhbw.ka.se2.vecto4j.Co2Simulator;
import de.dhbw.ka.se2.vecto4j.IncompleteVehicleException;
import de.dhbw.ka.se2.vecto4j.Simulator;
import de.dhbw.ka.se2.vecto4j.WrongVehicleClassException;


public class TestVectoSimulations {

	public static void main(String[] args) {
		VehicleWeightsClient weights = new LogisticsClient();
		Simulator vecto = new Co2Simulator();
		Co2SimulationProcess process = new Co2SimulationProcess(weights, vecto);
		VehicleConfigGenerator print = new VehicleConfigGenerator();
		for (int i = 0; i < 3; i++) {
			FullVehicle config = new FullVehicle();
			VehicleConfiguration vc = print.generateVehicle(false);
			config.setConfig(vc);
			try {
				System.out.println(process.simulateVehicle(config));
			} catch (IncompleteVehicleException | WrongVehicleClassException e) {
				e.printStackTrace();
			}
		}
	}
}
