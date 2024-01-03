package lsp;

// Bài toán có một interface có các tính năng của mạng xã hội và chat nhưng một số phần mềm không hỗ trợ
// Nên chúng ta chia các chức năng thành các interface khác nhau theo mục đích.

public abstract class SocialMedia {


    //support Facebook, WhatsApp, Instagram
    public abstract void chatWithFriend();

    //support Facebook, Instagram
    public abstract void publishPost(Object post);

    //support WhatsApp, Facebook, Instagram
    public abstract void sendPhotosAndVideos();

    //support WhatsApp, Facebook
    public abstract void groupVideoCall(String users);
}
