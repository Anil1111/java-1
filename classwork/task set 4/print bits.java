import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.print(obj);
    }
    public static void main(String[] args){
        print("Enter an int: ");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int mask = 1;
        int count = 0;
        //print("\n");
        //print(n+"\n");
        int bitsize = 0;
        for( int i=0; i<32; i++){
            if( (n & (mask << i)) != 0)
                bitsize = i;
        }
        
        for( int i=0; i<(bitsize+1); i++){
            if (i > 0) {
                print(", ");
            }
            if( (n & (mask << i)) != 0){
                print("1");
            }
            else {
                print("0");
            }
            if (i == bitsize) {
                print(".");
            }
        }
        print("\n");
    }
}
  