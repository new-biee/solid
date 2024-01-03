package ocp;

//Muốn mở rộng class này thì ta phải sửa đổi, thêm tình năng mới vào class
// vậy nên ta sẽ sử dụng tính chất kết thừa để tạo một class con rồi kế thừa từ class cha muốn thêm tính năng mà
// không cần phải sửa đổi class cha đó
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
