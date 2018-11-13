import java.util.*;
public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        newarr();
    }
    public static void newarr(){
        int[][] arr = { {1,3}, {3,4,5,8}, {6,8}, {1,9,6} };
        //int [] [] arr = {{},{}};
        int [] arr2 = new int [(arr.length)];
        int max;
        for (int k =0; k < arr.length; k++) {
            max = 0;
            for (int x = 0; x< (arr[k].length); x++) {
                max = (max > arr[k][x])? max:arr[k][x];
            }
            //print(max);
            arr2[k] = max;    
        }
    //print(Arrays.toString(arr2));
    }
}
  