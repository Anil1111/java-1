import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.print(obj);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = -1;
        int num1;
        int num2;
        int maxnum = 0;
        do {
            print("enter a natural number (0 if done): ");
            input = scan.nextInt();
            num2 = input % 10;
            num1 = ((input/10) %10);
            maxnum = ((num1+num2) > ((maxnum%10)+((maxnum/10)%10))) ? input : maxnum;
        } while (input != 0);
        print("Max sum of digits was "+((maxnum%10)+((maxnum/10)%10))+" for "+maxnum+"\n");
    }
}
  