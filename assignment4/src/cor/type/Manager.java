package cor.type;

import cor.Approver;
import cor.ExpenseRequest;

public class Manager extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1500) {
            System.out.println("Manager approved request for " + request.getAmount() + ": " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
