    //outline 
    /* 3 methods
    game prep
    check whether the letter is in the word
    end 
Note: create an array for guessed letters and notify the user if they repeat.
    */

import java.io.*;
import java.util.*;

public class Classwork {
    /**
     * print simplification
     * @param obj
     */
    static void print(Object obj) {
        System.out.println(obj);
    }
    /**
     * runs the game
     * @param args
     */
    public static void main(String[] args){
        play(start());
    }
    /**
     * Reads in users guess and returns it as a char
     * @return
     */
    public static char charread() {
        Scanner scan = new Scanner(System.in);
        char userguess = scan.next().charAt(0);
        return userguess;
    }
    /**
     * Welcome message, chooses a word
     * @return
     */
    public static String start() {
        print("Welcome to hangman!");
        Random rnd = new Random();
        List<String> liststrings = new ArrayList<String>();
        try {
            Scanner scan = new Scanner(new File("words.txt"));
            while (scan.hasNextLine()){
                liststrings.add(scan.nextLine());
            //    print(scan.nextLine());
            }
            //System.out.println(Arrays.toString(liststrings.toArray()));  //prints arraylist
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found!");
        }
        String word = liststrings.get(rnd.nextInt(liststrings.size()));
        print(word);
        return word;
    }
    public static void play(String word) {
        setup(word);
        print("You have 13 guesses");
        int guesses = 13;
        char userinput;
        char [] wordarr = word.toCharArray();

        ArrayList<Character> arrlist = new ArrayList<>();
        for (Character ch : wordarr) {
            arrlist.add('_');
        }
        int times = 0;
        print(Arrays.toString(arrlist.toArray())); //replace with a loop that prints 
        for (int x = 0; x < guesses;x++) {
            userinput = charread();
            ArrayList<Integer> lettersat = guess(userinput, wordarr);
            times = lettersat.size();
            print("letter "+ userinput+" is in the word "+times+" times"); // add to say how many times based on array length
            print("Guesses left "+(12-x));
            print(arrlist);
        }
    }
    /**
     * tells the user the length and displays blanks
     * @param word
     * @return
     */
    public static String [] setup(String word) {
        String [] arr = word.split("");
        print("The word consists of "+word.length()+ " letters.");
        //for (String i : arr) {
        //    System.out.print("_ ");
        //}
        //System.out.print("\n");
        return arr;
    }
    public static ArrayList guess(char n, char [] arr) {
        boolean letterIsInWord = false;
        ArrayList<Integer> lettersat = new ArrayList<>();
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] == n){
                letterIsInWord = true;
                lettersat.add(l);

                //print("letter "+ n+" is in the word");
            }
            //else {
                //print("letter "+n+" is not in the word");
            //}
        }
        return lettersat; //return an array of indexes of the letter 

        //return letterIsInWord;
    }
}