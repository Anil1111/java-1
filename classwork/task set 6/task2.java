import java.util.*;
public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        int [] arr = {20,1,4,5};
        int max = arr[0];
        for (int x = 0; x < arr.length; x++) {
            max = (max < arr[x])? arr[x]: max;
        }
        int max2 = max;
        for (int y = 0; y < max; y++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] < max2) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            max2--;
            System.out.print("\n");
        }
    }
}
  