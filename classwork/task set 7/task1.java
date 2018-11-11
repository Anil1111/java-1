import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        int[][] arr = { {1,3,2}, {3,4,8}, {2,6,8}, {1,8,5} };
        largestSum(arr);
    }
    public static void largestSum(int [] [] arr){
        int rowmax = 0;
        int columnmax = 0;
        int maxrowindex = 0;
        int maxcolumnindex = 0;
        print(Arrays.deepToString(arr));
        for (int x = 0; x < arr.length; x++) {
            int rowTotal = 0;
            for (int z = 0; z < arr[0].length; z++) {
                rowTotal += arr[x][z];
            }
            if (rowTotal > rowmax){
                maxrowindex = x;
                rowmax = rowTotal;
            }
        }
        for (int k = 0; k < arr[0].length;k++){
            int columntotal = 0;
            for (int l = 0; l < arr.length;l++){
                columntotal += arr[l][k];
            }
            if (columntotal > columnmax){
                maxcolumnindex = k;
                columnmax = columntotal;
            }
        }
        print("max row index: "+ maxrowindex);
        print("max column index:"+ maxcolumnindex);

    }
}
  