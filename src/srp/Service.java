package srp;

// Bài toán có một class Service có các method thực hiện các tác vụ khác nhưng cùng chúng 1 class
// Phương án tối ưu. Chúng ta chia thành các class khác nhau theo mục địch của chúng.
public class Service {

    public long deposit(long amount, String accountNo){
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo){
        //withDraw amount
        return 0;
    }

    public void printPassbook(){
        //update transaction info in passbook
    }

    public void getLoanInterestInfo(String loanType){
        if (loanType.equals("homeLoan")){
            //do some job
            return;
        }
        if (loanType.equals("personalLoan")){
            //do some job
            return;
        }
        if (loanType.equals("car")){
            //do some job
            return;
        }
    }

    public void sendOTP(String medium){
        if (medium.equals("email")){
            //write email logic
            return;
        }
        if (medium.equals("mobile")){
            //write phone logic
        }
    }
}
