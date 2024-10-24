package cor;

public class CORMain {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(300, "Office Supplies");
        approvalChain.processRequest(request1); // team lead

        ExpenseRequest request2 = new ExpenseRequest(1200, "Conference Fees");
        approvalChain.processRequest(request2); // manager

        ExpenseRequest request3 = new ExpenseRequest(4000, "New Equipment");
        approvalChain.processRequest(request3); // director

        ExpenseRequest request4 = new ExpenseRequest(7000, "Corporate Event");
        approvalChain.processRequest(request4); // ceo
    }
}

