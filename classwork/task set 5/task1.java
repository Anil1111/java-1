import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.print(obj);
    }
    static void numberprint () {
        for (char i = 40; i < 123; i++ ) {
            char z = i;
            print(z);
            z += 1;
        }
    }
    public static void main(String[] args){
        numberprint();
    }
}
