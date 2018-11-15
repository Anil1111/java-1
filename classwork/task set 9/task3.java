import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        Random rnd = new Random();
        int [] arr = new int [20];
        for (int i = 0; i < arr.length-1;i++) {
            arr[i] = rnd.nextInt(18)+1;
        }
        print(Arrays.toString(arr));
        for (int z =arr.length-1; z > 10; z-- ){
            int temp = arr[z];
            arr[z] =arr[z-1];
            arr[z-1] = temp;
        }
        arr[10] = -1;
        print(Arrays.toString(arr));
    }
}
  