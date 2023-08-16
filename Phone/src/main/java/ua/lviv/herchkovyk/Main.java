package ua.lviv.herchkovyk;

public class Main {
    public static void main(String[] args) {
        NokiaPhone nokiaPhone = new NokiaPhone();
        SamsungPhone samsungPhone = new SamsungPhone();

        nokiaPhone.call();
        nokiaPhone.makePhoto();
        nokiaPhone.makeVideo();
        nokiaPhone.sendMessage();

        samsungPhone.call();
        samsungPhone.sendMessage();
    }
}