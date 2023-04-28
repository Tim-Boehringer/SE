package de.dhbw.ka.se2.application.vecto;

import de.dhbw.ka.se2.domain.logistics.VehicleWeights;
import de.dhbw.ka.se2.domain.print.FullVehicle;
import de.dhbw.ka.se2.domain.print.VehicleConfiguration;
import de.dhbw.ka.se2.vecto4j.input.VehicleInput;
import de.dhbw.ka.se2.vecto4j.input.VehicleType;

public class Co2SimulationProcess {
    private final WeightsClient weightsAccess;
    private final Simulator simulator;
    public Co2SimulationProcess(final VehicleWeightsClient weightsAccess, final Simulator simulator) {
        this.weightsAccess = weightsAccess;
        this.simulator = simulator;
    }
    public ElectricVehiclesSimulationResult simulateVehicle (final FullVehicle vehicle){
        VehicleInput input = getInputForVehicle(vehicle);
        enrichInputWithComponents(vehicle.getConfig(), input);
        enrichInputWithWeights(vehicle.getConfig(), input);
        return simulator.calculateVehicle(input);
    }
    public VehicleInput getInputForVehicle(final FullVehicle vehicle){
        VehicleInput input = new VehicleInput();
        switch(vehicle.getMetadata().getType()){
            case LORRY:
                input.setType(VehicleType.LORRY);
                return input;
            case TRACTOR:
                input.setType(VehicleType.TRACTOR);
                return input;
        }
        throw new IllegalArgumentException("Unknown type " + vehicle.getMetadata().getType());
    }
    private void enrichInputWithComponents(final VehicleConfiguration config, final VehicleInput input){

    }
    private void enrichInputWithWeights(){

    }
}