import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //remove later
        Random rand = new Random();
        int random = rand.nextInt(1000000);
        print(random);
        String user = "n";
        int guesses = 0;
        double number = 500000;
        double maxguess = 1000000;
        double minguess = 1;
        while (!(user.equals("y"))) {
        print(number +" is this n?");
        guesses += 1;
        user = scan.next();
        if (user.equals("s")) {
            minguess = number;
        }
        else if (user.equals("b")) {
            maxguess = number;
        }
        number = (minguess+maxguess)/2;
        }
        print("Your number is "+number+" and took "+guesses+" guesses.");
    }
}
  