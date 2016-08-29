
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
            case 2:
                eureka = "09:30 - 11:30";
                break;
            case 3:
                eureka = "13:30 - 15:30";
                break;
            case 4:
                eureka = "15:40 - 17:40";
                break;
            case 5:
                eureka = "18:00 - 20:00";
                break;
            case 6:
                eureka = "20:00 - 22:00";
                break;
            default:
                eureka = "Noob";
                break;
        }
        return eureka;
    }
}
