import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        Random rnd = new Random();
        int [] arr1 = new int [Math.abs(rnd.nextInt(100))];
        int [] arr2 = new int [Math.abs(rnd.nextInt(100))];
        int [] arr3 = new int [Math.abs(rnd.nextInt(100))];
        for (int x = 0;x < arr1.length;x++){
            arr1[x] = Math.abs(rnd.nextInt(100));
        }
        for (int y = 0;y < arr2.length;y++){
            arr2[y] = Math.abs(rnd.nextInt(100));
        }
        for (int z = 0;z < arr3.length;z++){
            arr3[z] = Math.abs(rnd.nextInt(100));
        }
        int [] [] arrfinal = new int [3] [(arr1.length+arr2.length+arr3.length)];
        arrfinal[0] = arr1;
        arrfinal[1] = arr2;
        arrfinal[2] = arr3;
        
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));
        //System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.deepToString(arrfinal));

    }
}
  