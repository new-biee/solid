package ocp;

//Muốn mở rộng class này thì ta phải sửa đổi, thêm tình năng mới vào class
// vậy nên ta sẽ sử dụng tính chất kết thừa để tạo một interface rồi thêm tính năng mới vào interface
// giúp không phải sửa đổi trong class

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
