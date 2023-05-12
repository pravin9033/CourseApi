package phone;
// this is a factory to give out instances of all the operating systems based on user input
public class OSFactory {
    Android android;
    public OS getInstance(String str){
        if(str.equals("Open")){
            if (android == null) {
                android = new Android();
            }
            return android;
        }
        else if (str.equals("Close")) {
            return new IOS();
        }
        else{
            return new Windows();
        }
    }
}
