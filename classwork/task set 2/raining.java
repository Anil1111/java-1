import java.util.*;

public class raining {
    static void print(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args){
        Random rnd = new Random();
        boolean isItRaining = rnd.nextBoolean();
        boolean isItShining = rnd.nextBoolean();
        
        
        if (isItRaining && isItShining) {
            print("rainbow in the sky");
        }
        else if (isItRaining) {
            print("wet weather");
        }
        else if ((isItRaining == false) && (isItShining== false)) {
            print("it is cloudy");
        }
        else {
            print("the sun shines");
        }

    }
}