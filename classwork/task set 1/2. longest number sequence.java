import java.util.*;

public class practice {
    static void print(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int buffer = -1;
        int input = scan.nextInt();
        int value = input;
        int currentcount = 1;
        do {
            input = scan.nextInt();
            if (input == value){
                currentcount += 1;
            }
            else {
                if (count < currentcount) {
                    count = currentcount;
                    buffer = value;
                }
                currentcount = 1;
            }
            value = input;
        } while (input != 0);
        print("Longest sequence: "+count+" times "+buffer);
        scan.close();
    }
}