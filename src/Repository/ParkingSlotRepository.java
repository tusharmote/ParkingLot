package Repository;

import Models.ParkingSlot;

import java.util.HashMap;
import Exception.ParkingSlotNotFoundException;

public class ParkingSlotRepository {
    private HashMap<Integer, ParkingSlot> parkingSlotMap;

    public ParkingSlotRepository() {
        this.parkingSlotMap = new HashMap<>();
    }
    public ParkingSlot get(int parkingSlotId) throws ParkingSlotNotFoundException {
        ParkingSlot parkingSlot=parkingSlotMap.get(parkingSlotId);
        if(parkingSlot==null){
            throw new ParkingSlotNotFoundException("ParkingSlot not fount at id "+ parkingSlotId);
        }
        return parkingSlot;
    }
    public ParkingSlot put(ParkingSlot parkingSlot){
        parkingSlotMap.put(parkingSlot.getId(),parkingSlot);
        return parkingSlot;
    }

}
