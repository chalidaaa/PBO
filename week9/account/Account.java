package account;

public class Account {
    protected int accountNumber;
    protected int balance;

    // Konstruktor Account
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Method untuk menarik uang, bisa di-override oleh subclass
    public void tarikUang(int amount) throws eksepsi.InsufficientFundsException {
        if (amount > balance) {
            throw new eksepsi.InsufficientFundsException(amount - balance);
        }
        balance -= amount;
        System.out.println("Uang berhasil ditarik: Rp " + amount);
    }

    public int getBalance() {
        return balance;
    }
}
