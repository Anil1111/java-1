    //outline 
    /* 3 methods
    game prep
    check whether the letter is in the word
    end 

    */

import java.io.*;
import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        play(start());
    }
    public static char charread() {
        Scanner scan = new Scanner(System.in);
        char userguess = scan.next().charAt(0);
        return userguess;
    }
    /* Welcome message, chooses a word */
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
        for (int x = 0; x < guesses;x++) {
            userinput = charread();
            guess(userinput, wordarr);
            print("Guesses left "+(12-x));
        }
    }
    public static String [] setup(String word) {
        //print(word);
        String [] arr = word.split("");
        print("The word consists of "+word.length()+ " letters.");
        for (String i : arr) {
            System.out.print("_ ");
            //print(i);
            //print(Arrays.toString(arr));
        }
        System.out.print("\n");
        return arr;
    }
    public static boolean guess(char n, char [] arr) {
        boolean letterIsInWord = false;
        for (char l : arr) {
            if (l == n){
                letterIsInWord = true;
                print("the word has letter "+ n);
            }
        }
        return letterIsInWord;
    }
}