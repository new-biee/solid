package lsp;

// Bài toán có một interface có các tính năng của mạng xã hội và chat nhưng một số phần mềm không hỗ trợ
// Nên chúng ta chia các chức năng thành các interface khác nhau theo mục đích.

public interface SocialMedia {


    //support Facebook, WhatsApp, Instagram
    void chatWithFriend();

    //support Facebook, Instagram
    void publishPost(Object post);

    //support WhatsApp, Facebook, Instagram
    void sendPhotosAndVideos();

    //support WhatsApp, Facebook
    void groupVideoCall(String users);
}
