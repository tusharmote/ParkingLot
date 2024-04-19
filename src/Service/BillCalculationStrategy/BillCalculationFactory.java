package Service.BillCalculationStrategy;

public class BillCalculationFactory {
    private BillCalculationStrategy getBillCalculationStrategy(BillCalculationStrategies billCalculationStrategies){
        String strategy=billCalculationStrategies.name();
        switch(strategy){
            case "LOW":
                return new LowBillCalculationStrategy();
            default:
                return null;


        }
    }
}
