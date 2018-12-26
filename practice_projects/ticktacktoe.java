import java.util.*;
//playing ticktacktoe on 18 bits
//use an int
public class ticktacktoe {
    public static void main(String[] args){
        // 0 0000 0000 0 0000 0000 
        // yongest bits 1-9 are for null or filled, 0 is null, 1 is filled
        // olderst bits 10-18 are for "x" and "o", 0 is "o", 1 is "x"
        Scanner scan = new Scanner(System.in);
        int game = 0b0_0000_0000_0_1111_1111;
        //game = 0;
        boolean gamelive = true;
        while (gamelive){
            if ((game & 0b11_1111_1111_1111_1111) == 0){
                System.out.println("Welcome to the game of tick tack toe");
            }
            //print the play grid 
            int bit = 0;
            for (int x = 0; x <5; x++){ //rows
                if (x == 1 || x == 3){
                    System.out.print("----------");
                }
                if (x == 0 || x == 2 || x == 4){
                    for (int l = 0; l < 5; l++){ //columns
                        if ((l%2)!= 0){
                            System.out.print(" | ");
                        } else {
                            if ((game & (1 << bit)) == 0){
                                System.out.print(" ");
                            } else {
                                if ((game & (1<< bit+9)) != 0){
                                    System.out.print("x");
                                } else {
                                    System.out.print("o");
                                }
                            }
                            bit++;
                        }
                    }
                }
                System.out.println();
            } 
            //replace with clearing of the table 
            //scan an int for possition
            //scan the input "x" or "o"
            //set the grid space to 1 or 0 and set corresponding null check bit to 1
            System.out.println("Enter the position to which you want to play 1-9");
            int possition = scan.nextInt(); // number between 1 and 9
            System.out.println("x or o");
            char input = scan.next().charAt(0);
            if (input == 'x'){
                input = 1;
            } else {
                input = 0;
            }
            if (input == 1){
                game += (1 <<(possition+8));
            }
            game += (1 <<possition-1);
                        if ((game & 0b1_1111_1111) == 0b1_1111_1111){
                System.out.println("Game over ");
                gamelive = false;
            }
            //check if someone won
            //calculate result ex. tie, x wins, o wins
            /*
            first check that cells 1,5,9 not empty then compare values
            repeat for 7,5,3 4,5,6 2,5,8
            */
            String result = "Tie";
            if ((game & 0b1_0001_0001_1_0001_0001)==0b1_0001_0001_1_0001_0001){ // 1,5,9 not empty
                System.out.print("x wins");
            }
            if ((game & 0b0_1001_0010_0_1001_0010)==0b0_1001_0010_0_1001_0010 ){ // 2,5,8 not empty
                System.out.print("x wins");
            }
            if ((game & 0b0_0011_1000_0_0011_1000)==0b0_0011_1000_0_0011_1000){ // 4,5,6 not empty
                System.out.print("x wins");
            }
            if ((game & 0b0_0101_0100_0_0101_0100)==0b0_0101_0100_0_0101_0100){ // 7,5,3 not empty
                System.out.print("x wins");
            }
            // Question: how to check for a winner without hardcoding if statments?
            if ((game & 0b1_0001_0001)==0b1_0001_0001){ // 1,5,9 not empty
                System.out.print("o wins");
            }
            if ((game & 0b0_1001_0010)==0b0_1001_0010 ){ // 2,5,8 not empty
                System.out.print("o wins");
            }
            if ((game & 0b0_0011_1000)==0b0_0011_1000){ // 4,5,6 not empty
                System.out.print("o wins");
            }
            if ((game & 0b0_0101_0100)==0b0_0101_0100){ // 7,5,3 not empty
                System.out.print("o wins");
            }

        }
        scan.close();
    }
}