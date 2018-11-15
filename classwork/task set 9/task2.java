import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        char [] arr = {'a','l','a','m','a','k','o','t','a'};
        int acount = 0;
        for (char c : arr) {
            if (c == 'a'){
                acount++;
            }
            
        }
        print(acount);
    }
}
  