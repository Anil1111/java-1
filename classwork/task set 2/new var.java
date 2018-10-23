import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        boolean stat;
        if(Math.random() > 0.5){
            stat=true;
        }
        else {
            stat=false;
        }
        double var = (stat)? 5:8;
    }
}