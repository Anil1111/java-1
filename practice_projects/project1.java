//imports
import java.util.Scanner;
//project 
public class project1 {
    static void println (Object obj) { //moves to a new line
        System.out.println(obj);
    }
    static void print (Object obj) { //keeps on the same line
        System.out.print(obj);
    }
    public static void main (String[]args){
        //methods
        greeting();
        time_budget();
        time_diff();
        country_area();
        round();
    }
    static void greeting () { //asks for destination and congradulates on choice
        Scanner scan = new Scanner(System.in);
        println("Welcome to the trip planner");
        print("What is your name? ");
        String name = scan.nextLine();
        print("Nice to meet you "+name + "! Where are you traveling to? ");
        String destination = scan.nextLine();
        println("Great! "+ destination+" sounds like a great destination!");
        println("**********\n");
        
    }
    static void time_budget () {
        Scanner scan = new Scanner(System.in);
        print ("How many days are you going to spend traveling? ");
        int travel_length = scan.nextInt();
        print("How much money, in USD, are you planning on spending on your trip? ");
        int money = scan.nextInt();
        print("What is the three letter currency symbol for your travel destination? ");
        String currency = scan.next(); //why does nextLine not work??
        print("How many "+currency +" are there in 1 USD? ");
        int conversion_rate = scan.nextInt();
        println("\nIf you are traveling for "+ travel_length +" days that is the same as "+ (travel_length*24) +" hours or "+ (travel_length*24*60) +" minutes");
        println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+(money/travel_length)+" USD");
        println("Your total budget in "+currency+" is "+(money*conversion_rate)+" "+currency +" which per day is "+((money*conversion_rate)/travel_length)+" "+currency);
        println("**********\n");
        
    }
    static void time_diff () {
        Scanner scan = new Scanner(System.in);
        print("What is the time difference, in hours, between your home and your destination? ");
        int time_diff = scan.nextInt();
        int midnight_time;
        int noon_time;
        if (time_diff < 0) {
            midnight_time = 24 + time_diff;
            noon_time = 12 + time_diff;
        }
        else if (time_diff == 0) {
            midnight_time = 00;
            noon_time = 12;
        }
        else {
            midnight_time = time_diff;
            noon_time = 12+time_diff;
        }        
        println("That means that when it is midnight at home it will be "+(midnight_time)+":00 in your travel destination and when it is noon at home it will be "+(noon_time)+":00");
        println("**********\n");
        
    }
    static void country_area () {
        Scanner scan = new Scanner(System.in);
        print("What is the square area of your destination country in km? ");
        int area = scan.nextInt();
        println("In miles2 that is "+(area*0.386102));
        println("**********\n");
        
    }
    static void round () {
        Scanner scan = new Scanner(System.in);
        scan.close();        
    }
    
}