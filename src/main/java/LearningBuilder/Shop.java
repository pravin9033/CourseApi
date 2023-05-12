package LearningBuilder;

public class Shop {
    public static void main(String[] args) {
        //This is how we would do without BUILDER Design Pattern
//        Phone phone = new Phone("Android", 2, "Qualcomm", 5.5, 3000);
//        System.out.println(phone);


        // This is Builder Method
        Phone phone = new PhoneBuilder().setOS("IOS").setBattery(5000).getPhone();
        System.out.println(phone);

        Phone phone2 = new Phone();
        phone2.setOS("IOS");
        phone2.setBattery(4000);
        System.out.println(phone2);

        // Using this method we dont have to specify all the values of the phone. The unspecified values will result to the default values
        //This is the output - Phone{OS='IOS', ram=0, company='null', screenSize=0.0, battery=5000}
    }
}
