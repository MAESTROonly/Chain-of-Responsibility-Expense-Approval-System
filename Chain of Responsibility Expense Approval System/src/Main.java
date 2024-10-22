public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        // Test expense requests
        ExpenseRequest request1 = new ExpenseRequest(300, "Office Supplies");
        approvalChain.processRequest(request1); // Should be approved by Team Lead

        ExpenseRequest request2 = new ExpenseRequest(1200, "Conference Fees");
        approvalChain.processRequest(request2); // Should be approved by Manager

        ExpenseRequest request3 = new ExpenseRequest(4000, "New Equipment");
        approvalChain.processRequest(request3); // Should be approved by Director

        ExpenseRequest request4 = new ExpenseRequest(8000, "Company Acquisition");
        approvalChain.processRequest(request4); // Should be approved by CEO
    }
}
