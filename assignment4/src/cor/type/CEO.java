package cor.type;

import cor.Approver;
import cor.ExpenseRequest;

public class CEO extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        System.out.println("CEO approved request for " + request.getAmount() + ": " + request.getPurpose());
    }
}
