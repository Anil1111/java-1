import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        
        int [] [] arr = new int [8] [8];
        Random rnd = new Random();
        for (int [] k : arr) {
            for (int z = 0; z < k.length; z++){
                k[z] = rnd.nextInt(10);
            }   
        }
        int p = 0;

        int [] temp = new int [8];
        for (int g =0; g <8; g++){
            temp[g] = arr[g][g];
        }
        int [] temp2 = new int [8];
        for (int v =0; v <8; v++){
            for (int s = temp2.length-1; s>0;s--) {
                temp2[v] = arr[v][s];
            }
        }
        
        //int [] temp = {0,0,0,5,6,7,8,2};
        Arrays.sort(temp);
        for(int i = 2; i < temp.length; i++) {
            if(temp[i] == temp[i - 1] && temp[i -2] == temp[i-1]) {
                System.out.println("Duplicate: " + temp[i]);
            }
        }
        Arrays.sort(temp2);
        for(int y = 2; y < temp2.length; y++) {
            if(temp2[y] == temp2[y - 1] && temp2[y -2] == temp2[y-1]) {
                System.out.println("Duplicate: " + temp2[y]);
            }
        }


        //System.out.print(Arrays.toString(temp));
        //System.out.print(Arrays.toString(temp2));
        //System.out.print(Arrays.deepToString(arr));
    }
}
  