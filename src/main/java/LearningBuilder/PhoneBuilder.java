package LearningBuilder;
//This is a builder class
//We will only use setter and change void return type to phoneBuilder instance.
public class PhoneBuilder {
    private String OS;
    private int ram;
    private String company;
    private double screenSize;
    private int battery;
    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(OS,ram,company,screenSize,battery);
    }
}
