package Repository;

import Models.ParkingLot;

import java.util.HashMap;
import Exception.ParkingLotNotFoundException;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }
    public ParkingLot get(int parkingLotId) throws ParkingLotNotFoundException {
        ParkingLot parkingLot=parkingLotMap.get(parkingLotId);
        if(parkingLot==null){
            throw new ParkingLotNotFoundException("ParkingLot not fount at id "+ parkingLotId);
        }
        return parkingLot;
    }
    public ParkingLot put(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        return parkingLot;
    }

}