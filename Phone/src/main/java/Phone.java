import ua.lviv.herchkovyk.PhoneConnection;

public abstract class Phone {

private String name;
private String model;
private int volume;
private int ozu;

    public Phone(String name, String model, int volume, int ozu) {
        this.name = name;
        this.model = model;
        this.volume = volume;
        this.ozu = ozu;
    }
}
