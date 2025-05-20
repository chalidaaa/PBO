package eksepsi;

public class InsufficientFundsException extends Exception {
    private int amount;

    // Konstruktor
    public InsufficientFundsException(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
