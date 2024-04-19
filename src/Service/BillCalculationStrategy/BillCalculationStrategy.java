package Service.BillCalculationStrategy;

import Models.Ticket;
import Models.Vehicle;

import java.time.LocalDateTime;

public interface BillCalculationStrategy {
    public static  double calculateBill(Ticket ticket, LocalDateTime exiTime){
        return 0;
    }
}
