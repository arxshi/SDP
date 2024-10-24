package cor;

import cor.type.CEO;
import cor.type.Director;
import cor.type.Manager;
import cor.type.TeamLead;

public class ApprovalChain {
    private Approver chain;

    public ApprovalChain() {
        buildChain();
    }

    private void buildChain() {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        chain = teamLead; // starting point of the chain
    }

    public void processRequest(ExpenseRequest request) {
        chain.handleRequest(request);
    }
}

