package dip;

// Tại đấy chỉ sử dụng được một loại thanh tóa khi đi mua hàng
public class ShoppingMall {

    private final DebitCard debitCard;

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

        public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
