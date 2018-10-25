import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.print(obj);
    }
    public static void main(String[] args){
        int n = 11;
        print("\n");
        for (int y = 1; y < n; y++) {
            System.out.printf("%4d",(y));
            for (int x = 2; x < (n); x++) {
                System.out.printf("%4d",x*(y));
            }
            print("\n");
        }
        print("\n");
    }
}
