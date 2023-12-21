package dip.solution;

public class ShoppingMall {

    private final BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard creditCard = new CreditCard();
        creditCard.doTransaction(5000);

        BankCard debitCard = new DebitCard();
        debitCard.doTransaction(1000);
    }
}
