public class Manager extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1500) {
            System.out.println("Manager approved the expense request: " + request);
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}

