import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    static int GCD (int m, int n) {
        if (m == 0) {
            return n;
          }
          else {
            while (m > 0) {
              if (m > n) {
                int temp = m;
                m = n;
                n = temp;
              }
              else if (m == n){
                return n;
              }
              else {
                n = n-m;
              }
            }
        }
        return n;
    }
    public static void main(String[] args){
        //gen 10 pairs of ints [0,100]
        Random rnd = new Random();
        int x = 0;
        while (x<11){
            int int1 = rnd.nextInt(100);
            System.out.print(int1+" ");
            int int2 = rnd.nextInt(100);
            System.out.print(int2+" ");
            print (GCD(int1, int2));
            //System.out.print(GCD(rnd.nextInt(100),rnd.nextInt(100))+"\n");
            x++;
        }
    }
}
  