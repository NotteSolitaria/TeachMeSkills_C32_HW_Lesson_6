package Task_1;

/**
 * Create a CreditCard class with the fields account number, current account balance.
 * Create one constructor with two parameters.
 * Create a TransferService class - a transfer service.
 * Add a method that allows you to add a sum to a credit card.
 * The method takes the sum and the card as input. Inside the method, create code that adds the sum passed to the method to the current sum on the card passed to the method.
 * Add a method that allows you to withdraw a certain sum from the card.
 * The method takes the sum and the card as input. Inside the method, write code that subtracts the passed sum from the current sum on the passed card.
 * Add a method that displays the current card information to the console.
 * Think over and implement various checks inside the methods for withdrawing/adding: for example, a negative number was passed, 0 was passed, a request to withdraw an amount greater than what is currently on the card, and other possible checks.
 * Write a program that creates three objects of the CreditCard class with an account number and an initial amount specified.
 */

public class Card {
    public static void main(String[] args) {

        CreditCard card_1 = new CreditCard(490304, 80);
        CreditCard card_2 = new CreditCard(790478, 65);
        CreditCard card_3 = new CreditCard(317732, 37);

        TransferService transferService = new TransferService();

        transferService.chargingToCard(card_1,58);
        transferService.chargingToCard(card_2,78);
        transferService.removal(card_3,42);

        transferService.showCardInfo(card_1);
        transferService.showCardInfo(card_2);
        transferService.showCardInfo(card_3);
    }
}