import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        //array declaration
        int [] arrayname = {1,2,3,4,5,6,7,8,9,10};
        for (int i =0; i < arrayname.length; i++) {
            System.out.println(arrayname[i]);
            //arrayname[i] = ((int)(Math.random()*5));
            //print(arrayname[i]);
        }
        int val1;
        int val2;
        int temp;
    
        boolean run = true;
        while (run) {
            //choose random
            val1 = (int)(Math.random()*10);
            val2 = (int)(Math.random()*10);
            //swap
            temp = arrayname[val1];
            arrayname[val1] = arrayname[val2];
            arrayname[val2] = temp;
            run = false;
            //check
            for (int k = 0; k < (arrayname.length-1) && !run; k++) {
                if ( arrayname[k] +1 == (arrayname [k+1])) {
                    run = true;  
                }
            }
        }
        for (int i =0; i < arrayname.length; i++) {
            System.out.println(arrayname[i]);
            //arrayname[i] = ((int)(Math.random()*5));
            //print(arrayname[i]);
        }
        int minval = arrayname.length;
        int location = 0;
        int p;
        for (p = 0; p < arrayname.length-1; p++) {
            minval = (arrayname[p] < minval) ? arrayname[p] : minval;
            location = (arrayname[p] < minval) ? p : location;
        }
        //swap
        temp = arrayname[p];
        arrayname[p] = arrayname[0];
        arrayname[0] = temp;
    }
}
  