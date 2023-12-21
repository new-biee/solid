package ocp;


public interface NotificationServiceI {

    void sendOTP(String medium);

    void sendTransactionReport(String medium);
}
