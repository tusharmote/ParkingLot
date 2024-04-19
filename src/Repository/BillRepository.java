import Models.Bill;

import java.util.HashMap;
import Exception.BillNotFoundException;

public class BillRepository {
    private HashMap<Integer, Bill> billMap;

    public BillRepository() {
        this.billMap = new HashMap<>();
    }
    public Bill get(int billId) throws BillNotFoundException {
        Bill bill=billMap.get(billId);
        if(bill==null){
            throw new BillNotFoundException("Bill not fount at id "+ billId);
        }
        return bill;
    }
    public Bill put(Bill bill){
        billMap.put(bill.getId(),bill);
        return bill;
    }

}