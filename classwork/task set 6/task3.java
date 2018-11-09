import java.util.*;
public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
       int [] arr = {1,2,3,4,5};
       int temp;
       for (int x = 0; x < arr.length-1; x++) {
           temp = arr[x+1];
           arr[x+1] = arr[x];
           arr[x] = temp;
       }
       print(Arrays.toString(arr));
    }
}
  