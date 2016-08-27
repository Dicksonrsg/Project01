
package CTRL;

public class Masker {
    public static String format(String phone) {
        int length = phone.length();
        if (length == 10) {
            phone = "(" + phone.substring(0, 2) + ") " + phone.substring(2,6) + "-" + phone.substring(6);
        } else {
            phone = "(" + phone.substring(0, 2) + ") " + phone.substring(2,7) + "-" + phone.substring(7);
        }
        return phone;
    }
    
    public static String clear(String phone) {
        return phone = phone.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
    }
    
    public static String wizard(int shift){
        String eureka = "";
        switch(shift){
            case 1:
                eureka = "07:20 - 09:20";
                break;
        }
        return eureka;
    }
}
