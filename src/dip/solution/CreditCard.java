package dip.solution;

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("Credit card " + amount);
    }
}
