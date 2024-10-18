package Task_1;

public class TransferService {

    public void chargingToCard(CreditCard card, int amountToReplenish){
        if (amountToReplenish >= 0) {
            card.amountOnAccount += amountToReplenish;
        } else if (amountToReplenish < 0) {
            System.out.println("Input amount is less than 0");
        }
    }

    public void removal( CreditCard card, int amountToWithdraw){
        if (amountToWithdraw <= 0) {
            System.out.println("Сумма должна быть положительной.");
            return;
        }
        if (amountToWithdraw > card.amountOnAccount) {
            System.out.println("Недостаточно средств для снятия.");
            return;
        }
        int balanceAfterWithdrawal = card.amountOnAccount - amountToWithdraw;
        System.out.println("Amount remaining after withdrawal: " + balanceAfterWithdrawal);
    }

    public void showCardInfo(CreditCard card){
        System.out.println("Номер карты: " + card.accountNumber + " Баланс карты: " + card.amountOnAccount);
    }
}
