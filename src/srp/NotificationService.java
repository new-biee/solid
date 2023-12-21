package srp;

public class NotificationService {
    public void sendOTP(String medium){
        if (medium.equals("email")){
            //write email logic
            return;
        }
        if (medium.equals("mobile")){
            //write phone logic
            return;
        }
    }
}
