package Service.SlotAllocationStrategy;

import Models.Constants.VehicleType;
import Models.Gate;
import Models.ParkingLot;
import Models.Vehicle;

public interface SlotAllocationStrategy {
    ParkingLot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate gate);

}
