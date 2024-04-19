package Service.SlotAllocationStrategy;

import Models.Constants.VehicleType;
import Models.Gate;
import Models.ParkingLot;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public ParkingLot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate gate) {
        int floorNumber= gate.getFloorNumber();
        

        return null;
    }
}
