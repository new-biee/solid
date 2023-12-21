package dip.solution;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("Debit card " + amount);
    }
}
