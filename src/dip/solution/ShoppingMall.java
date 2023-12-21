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
        ShoppingMall shoppingMall = new ShoppingMall(creditCard);
        shoppingMall.doPurchaseSomething(5000);

        BankCard debitCard = new DebitCard();
        ShoppingMall shoppingMall1 = new ShoppingMall(debitCard);
        shoppingMall1.doPurchaseSomething(5000);
    }
}
