import java.util.*;

public class task{
    public static void main(String[] args){
        String[] arr = {"Kate", "Bea", "Mary", "Bea", "Zoe"};
        System.out.println(Arrays.toString(arr));
        sortSel(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static boolean isLess(String a, String b){
        if (a.length()>b.length()){
            return false;
        } else {
            if (a.compareTo(b) < 0 ){
                return true;
            } else if (a.compareTo(b) > 0) {
                return false;
            } else {
                return true;
            }
        }
    }
    public static void sortSel(String [] arr){
        for (int j = 0; j < arr.length-1; j++){
            int iMin = j;
            for (int i = j+1; i < arr.length-1 ; i++){
                if (isLess(arr[i], arr[iMin])){
                    iMin = i;
                }
            }
            if (iMin != j) 
            {
                String temp = arr[j];
                arr[j] = arr[iMin];
                arr[iMin] = temp;
            }
        }
    }
}