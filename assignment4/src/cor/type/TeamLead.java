package cor.type;

import cor.Approver;
import cor.ExpenseRequest;

public class TeamLead extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 500) {
            System.out.println("Team Lead approved request for " + request.getAmount() + ": " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
