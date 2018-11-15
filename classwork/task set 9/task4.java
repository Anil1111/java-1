import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        int[] arr = { 2,3,4,3,6,7,6,2,9 };
        int[] brr = { 2,3,6,8,1,5 };

        L: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                    if (arr[i] == brr[j]) {
                        continue L;
                    }
            }
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k])
                    continue L;
            }
                System.out.print(arr[i]);
        }
        System.out.println();
    }
}
  