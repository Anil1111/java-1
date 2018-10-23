import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        int s= 0;
        for(int i= 1;i<= 10;i++){
            s=s+i;
            print(s);
        }
        print("next");
        int j = 1; 
        int n =0;
        while (j<=10) {
            n = n+j;
            j = j+1;
            print(n);
        }
    }
}