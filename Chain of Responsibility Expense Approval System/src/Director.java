public class Director extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Director approved the expense request: " + request);
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}

