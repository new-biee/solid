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
        ShoppingMall shoppingMall = new ShoppingMall(new CreditCard());
        shoppingMall.doPurchaseSomething(5000);

        ShoppingMall shoppingMall1 = new ShoppingMall(new DebitCard());
        shoppingMall1.doPurchaseSomething(5000);
    }
}
