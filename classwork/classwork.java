import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        int n = 6;
        for (int z = 0; z < n; z++){
            if (z ==0 || z == (n-1)){
                for (int k = 0; k<n;k++){
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                
                for (int l =0; l < (z-1);l++){
                    System.out.print(" ");
                }
                
                System.out.print("*");
                for (int s = (n-2-z);s > 0; s--){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }  
        }
    }
}
  