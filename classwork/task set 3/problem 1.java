import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(),
            b = scan.nextInt(),
            c = scan.nextInt(),
            d = scan.nextInt();

        for( int n=-5; n <= 5; n++){

            boolean set1 = (n >= a && n <= b);
            boolean set2 = (n >= c && n <= d);

            System.out.println(
                    (n >= 0 ? "+" : " ") + n +
                    ": inSum? " + (set1 || set2) +
                    "; inIntersect? " + (set1 && set2) +
                    "; inSymDiff? " + ((set1 || set2) && !(set1 && set2))
            );
        }
    }
}
  