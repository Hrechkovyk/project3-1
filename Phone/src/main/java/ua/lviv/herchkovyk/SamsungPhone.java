package ua.lviv.herchkovyk;

public class SamsungPhone implements PhoneConnection{

    @Override
    public void call() {
        System.out.println("I am calling");
    }

    @Override
    public void sendMessage() {
        System.out.println("I am sending a message");
    }
}
