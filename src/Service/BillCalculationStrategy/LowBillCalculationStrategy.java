package Service.BillCalculationStrategy;

import Models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LowBillCalculationStrategy implements BillCalculationStrategy{
    private static final double bike_hour_rate=50;
    private static final double car_hour_rate=100;
    private static final double increment_factor=0.1;
    public static double getCost(Ticket ticket){
        String vehicleType= ticket.getVehicle().getVehicleType().name();
        switch(vehicleType){
            case "CAR":
                 return car_hour_rate;
            case "BIKE":
                return bike_hour_rate;
            default:
                return 0;
        }
    }

    public static double calculateBill(Ticket ticket, LocalDateTime exitTime){
        LocalDateTime entryTime=ticket.getEntryTime();
        long total_hours = ChronoUnit.HOURS.between(exitTime,entryTime);
        double base_cost=total_hours*getCost(ticket);
        return base_cost + base_cost*(increment_factor*(total_hours-1));
    }
}
