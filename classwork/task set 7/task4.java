import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        int [] [] testarray = { {1,2,3,4,5,6},
                                {2,3,4,5,6,7},
                                {3,4,5,6,7,8},
                                {4,5,6,7,8,9} }; 
        inner(testarray);
    }
    public static int [] [] inner(int [] [] arr) {
        int [] [] arr2 = new int [(arr.length-2)] [(arr[0].length-2)];
        for (int k = 0; k < arr.length-2;k++) {
            for (int x =0; x < arr[0].length-2; x++) {
                arr2 [k] [x] = arr [k+1] [x+1];
            }
        }
        //print(Arrays.deepToString(arr2));
        return arr2;
    }
}