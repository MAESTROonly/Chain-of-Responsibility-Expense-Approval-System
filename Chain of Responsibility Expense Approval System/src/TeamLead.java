public class TeamLead extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 500) {
            System.out.println("Team Lead approved the expense request: " + request);
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
