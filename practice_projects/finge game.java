//imports
import java.util.*;

//main
public class project2 {
     //print shortcut
    static void print (Object obj) {
        System.out.println(obj);
    }
    public static void main (String[] args){
        prep();
        play();
    }
    static void prep() {
        print("Lets play a game called \"Odds and Evens \"");
        Scanner scan = new Scanner(System.in);
        print("What is your name?");
        String name = scan.next();
        print("Hi "+name+", which do you choose? (O)dds or (E)vens?");
        boolean validinput = false;
        while (validinput == false) {
            String choice = scan.next();
            if (choice.equals("O")||choice.equals("o")||choice.equals("Odds")) {
                print(name +" has picked odds! The computer will be evens.");
                validinput = true;
            }
            else if (choice.equals("E")||choice.equals("e")||choice.equals("Even")){
                print(name +" has picked evens! The computer will be odds.");
                validinput = true;
            }
            else {
                print("Invalid value please choose (O)dds or (E)vens!");
            }
        }
        print("--------------------------------------------");
        
    }
    static void play() {
        Scanner scan = new Scanner(System.in);
        print("How many “fingers” do you put out?");
        int player = scan.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        print("The computer plays number "+ computer);
        print("--------------------------------------------");
        int sum = player + computer;
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven = true) {
            print("even");
        }
        else {
            print("odd");
        }
        scan.close();
    }
}