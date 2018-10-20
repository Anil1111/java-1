//imports
import java.util.*;

//main
public class project2 {
     //print shortcut
    static void print (Object obj) {
        System.out.print(obj);
    }
    public static void main (String[] args){
        prep();
        print("\n");
    }
    static void prep() {
        print("Lets play a game called \"Odds and Evens\"\n");
        Scanner scan = new Scanner(System.in);
        print("What is your name? ");
        String name = scan.next();
        print("Hi "+name+", which do you choose? (O)dds or (E)vens? ");
        boolean validinput = false;
        String playeris = "None";
        while (validinput == false) {
            String choice = scan.next();
            if (choice.equals("O")||choice.equals("o")||choice.equals("Odds")) {
                print(name +" has picked odds! The computer will be evens.");
                validinput = true;
                playeris = "Odds";

            }
            else if (choice.equals("E")||choice.equals("e")||choice.equals("Even")){
                print(name +" has picked evens! The computer will be odds.");
                validinput = true;
                playeris = "Evens";
            }
            else {
                print("Invalid value please choose (O)dds or (E)vens!");
            }
        }
        print("\n--------------------------------------------\n");
        play(name, playeris);
        
    }
    static void play(String name, String playeris) {
        Scanner scan = new Scanner(System.in);
        print("How many “fingers” do you put out? ");
        int player = scan.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        print("The computer plays number "+ computer + " \"fingers\"");
        print("\n--------------------------------------------\n");
        int sum = player + computer;
        print(player +" + "+ computer+" = "+sum+"\n" );
        String outcome;
        if (sum % 2 == 0) {
            print(sum + " is ...even\n");
            outcome = "Evens";
        }
        else {
            print(sum + " is ...odd\n");
            outcome = "Odds";
        }
        scan.close();
        winner(playeris, outcome, name);
    }
    static void winner(String playeris, String outcome, String name) {
        if (playeris.equals(outcome)) {
            print("That means "+name + " wins");
        }
        else {
            print("The computer wins");
        }
        print("\n--------------------------------------------\n");
    }
}