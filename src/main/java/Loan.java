public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    // Static variable.
    static private double maxLoanAmount;

    // Since the variable is static, your method should also be static.
    public static double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
        
        // Set the max amount while creating the loan.
        if (this.amount > maxLoanAmount) {
            maxLoanAmount = this.amount;
        }
    }

    public void setAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getDisplayString() {
        return borrower + ": " + amount;
    }

    public double getProfit() {
        return amount * interestRate;
    }
}
