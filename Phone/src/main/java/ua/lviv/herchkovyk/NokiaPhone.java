package ua.lviv.herchkovyk;

public class NokiaPhone implements PhoneConnection,PhoneMedia {

    @Override
    public void call() {
        System.out.println("I am calling");
    }

    @Override
    public void sendMessage() {
        System.out.println("I am sending a message");
    }

    @Override
    public void makePhoto() {
        System.out.println("I am making photo");
    }

    @Override
    public void makeVideo() {
        System.out.println("I am making video");
    }
}
