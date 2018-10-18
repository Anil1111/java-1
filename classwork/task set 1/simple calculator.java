import java.util.*;

public class practice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        String operator = scan.next();
        double b = scan.nextDouble();
        String add = "+";
        String subtract = "-";
        String divide = "/";
        String multiply = "*";

        if (operator.equals(add)) {
        System.out.println(a+b);
        }
        else if (operator.equals(subtract)) {
        System.out.println(a-b);
        }
        else if (operator.equals(divide)) {
        System.out.println(a/b);
        }
        else if (operator.equals(multiply)) {
        System.out.println (a*b);
        }
        else {
        System.out.println("Error");
        }
    }
}