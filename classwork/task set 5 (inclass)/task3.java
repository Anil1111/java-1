import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    static void area() {
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();
        double s = ((side1+side2+side3)/2);
        print("area: "+ Math.sqrt((s*(s-side1)*(s-side2)*(s-side3))));
    }
    public static void main(String[] args){
        area();
    }
}
