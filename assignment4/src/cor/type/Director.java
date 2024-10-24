package cor.type;

import cor.Approver;
import cor.ExpenseRequest;

public class Director extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Director approved request for " + request.getAmount() + ": " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
