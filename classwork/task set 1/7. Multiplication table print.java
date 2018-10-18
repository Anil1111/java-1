import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.print(obj);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        print("Input n: ");
        int n = scan.nextInt();
        for (int j = 1; j < (n+1); j++) {
            System.out.printf("%4d",j);
            print(" ");
        }
        print("\n");
        for (int y = 1; y < n; y++) {
            System.out.printf("%4d",(y+1));
            print(" ");
            for (int x = 2; x < (n+1); x++) {
                System.out.printf("%4d",x*(y+1));
                print(" ");
            }
            print("\n");
        }
        print("\n");
    }
}
  