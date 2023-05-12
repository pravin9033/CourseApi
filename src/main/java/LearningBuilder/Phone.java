package LearningBuilder;
public class Phone {
    private String OS;
    private int ram;
    private String company;
    private double screenSize;
    private int battery;
    public Phone(String OS, int ram, String company, double screenSize, int battery) {
        this.OS = OS;
        this.ram = ram;
        this.company = company;
        this.screenSize = screenSize;
        this.battery = battery;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", company='" + company + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }

    public Phone() {

    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
