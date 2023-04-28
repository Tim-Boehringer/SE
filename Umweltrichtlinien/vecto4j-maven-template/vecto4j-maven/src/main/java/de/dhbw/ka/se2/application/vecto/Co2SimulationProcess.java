package de.dhbw.ka.se2.application.vecto;

import java.util.List;

import de.dhbw.ka.se2.adapter.vehicledata.VehicleComponentDecoder;
import de.dhbw.ka.se2.domain.print.FullVehicle;
import de.dhbw.ka.se2.domain.print.VehicleConfiguration;
import de.dhbw.ka.se2.domain.vehicledata.VehicleComponent;
import de.dhbw.ka.se2.plugin.vehicle.VehicleClient;
import de.dhbw.ka.se2.vecto4j.input.VehicleInput;
import de.dhbw.ka.se2.vecto4j.input.VehicleType;
import de.dhbw.ka.se2.vecto4j.Simulator;
import de.dhbw.ka.se2.vecto4j.output.ElectricVehicleSimulationResult;
import de.dhbw.ka.se2.vecto4j.IncompleteVehicleException;
import de.dhbw.ka.se2.vecto4j.WrongVehicleClassException;


public class Co2SimulationProcess {
    private final VehicleWeightsClient weightsAccess;
    private final Simulator simulator;
    public Co2SimulationProcess(final VehicleWeightsClient weightsAccess, final Simulator simulator) {
        this.weightsAccess = weightsAccess;
        this.simulator = simulator;
    }
    public ElectricVehicleSimulationResult simulateVehicle (final FullVehicle vehicle) throws IncompleteVehicleException, WrongVehicleClassException{
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
    private void enrichInputWithComponents(final VehicleConfiguration vc, final VehicleInput input){
        VehicleComponentDecoder vcd = new VehicleComponentDecoder();
        VehicleClient vClient = new VehicleClient();
        List<VehicleComponent> components = vClient.getComponents(vc);
        vcd.decodeAndAddComponents(components, input);
    }
    private void enrichInputWithWeights(VehicleConfiguration vc, VehicleInput input){
        input.setWeight(weightsAccess.getWeights(vc).getWeight());
    }
}
