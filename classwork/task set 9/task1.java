import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){

        String [] words = {"Ala", "kota", "ma","ma","a","kot","Ale"};
        String temp;
        temp = words[1];
        words[1] = words[2];
        words[2] = temp;
        temp = words[3];
        words[3] = words[4];
        words[4] = temp;
        temp = words[4];
        words[4] = words[5];
        words[5] = temp;
        for (String k : words) {
            System.out.print(k);
            System.out.print(" "); 
        }
        System.out.println();
    }
}
  