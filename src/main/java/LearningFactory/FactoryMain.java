package LearningFactory;

import phone.Android;
import phone.IOS;
import phone.OS;
import phone.OSFactory;

public class FactoryMain {
    public static void main(String[] args){
//        OS obj = new Android();
//        obj.specs();
//
//        OS obj2 = new IOS();
//        obj2.specs();
        // this method is known as factory method as the instance of the class is made in the factory and returned to us
        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("Open");
        obj.specs();


    }
}
