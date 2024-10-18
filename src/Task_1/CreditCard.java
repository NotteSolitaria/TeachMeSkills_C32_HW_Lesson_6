package Task_1;

public class CreditCard {

    int accountNumber;
    int amountOnAccount;

    public CreditCard(int accountNumber, int amountOnAccount) {
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }

    public int AccountNumber() {
        return accountNumber;
    }

    public int amountOnAccount() {
        return amountOnAccount;
    }

}
