import java.util.*;


public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        Random rnd = new Random();
        int [] mainarray = {rnd.nextInt(100),rnd.nextInt(100),rnd.nextInt(100),rnd.nextInt(100),rnd.nextInt(100),rnd.nextInt(100),rnd.nextInt(100)};
        print(Arrays.toString(mainarray));
        int firstodd = 0;
        int lasteven = 0;
        int lastevenat = 0;
        for (int x =mainarray.length-1; x > 0; x--) {
            if (mainarray[x] % 2 == 0) { //even
                lasteven = mainarray[x];
                lastevenat = x;
                break;
            }
        }
        for (int y = 0; y < mainarray.length; y++) {
            if (mainarray[y] % 2 != 0) { //odd
                firstodd = mainarray[y];
                mainarray[lastevenat] = mainarray[y];
                mainarray[y] = lasteven;
                break;
            }
        }
        print(Arrays.toString(mainarray));
    }
}
  