import java.time.LocalDateTime;
import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        int day = now.getDayOfMonth();
        int month = (now.getMonthValue()-1);
        if (month == 0){
            print(day);
        }
        else if (month == 1) {
            print (31+day);
        }
        else if (month == 2) {
            print (59+day);
        }
        else if (month == 3) {
            print (90+day);
        }
        else if (month == 4) {
            print (120+day);
        }
        else if (month == 5) {
            print (151+day);
        }
        else if (month == 6) {
            print (182+day);
        }
        else if (month == 7) {
            print (212+day);
        }
        else if (month == 8) {
            print (243+day);
        }
        else if (month == 9) {
            print (273+day);
        }
        else if (month == 10) {
            print (304+day);
        }
        else if (month == 11) {
            print (334+day);
        }
        else {
            print(355);
        }

    }
}
//better solution, with a switch statment