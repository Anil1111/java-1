import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        evenodd();
    }
    public static int [] evenodd(){
        int[][] arr = { {1,2,3,4,5}, {1,9}, {3,1,8} };
        int oddnumbers=0;
        int evennumbers=0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++){
                if (arr[i][k] % 2 != 0 ){
                    oddnumbers ++;
                }
                else {
                    evennumbers ++;
                }
                //print("array: "+i +" index: "+k);
            }
        }
        int [] finalarr = {evennumbers,oddnumbers};
        print(Arrays.toString(finalarr));
        return finalarr;
    }
}
  