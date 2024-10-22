public class ExpenseRequest {
    private double amount;
    private String purpose;

    public ExpenseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return "ExpenseRequest{" +
                "amount=" + amount +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
