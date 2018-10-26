import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mask = 1;
        int count = 0;
        //part 1
        for( int i=0; i<32; i++){
            if( (n & (mask << i)) != 0)
                count++;
        }
        System.out.println(count);
        //part 2
        if( (n & 0b1000000) != 0) {
            print("7th is set" );
        }
        else {
            print("7th not set");
        }
        //part 3
        count = -1;
        for( int i=0; i<32; i++){
            if( (n & (mask << i)) != 0)
                count = i;
        }
        System.out.println(count);
        //part 4
        print(Integer.toBinaryString(n));
        int z = n;
        n <<= 16;
        n =~ n;
        n >>>= 16;
        
        z >>= 16;
        z <<= 16;
        print(Integer.toBinaryString(n+z));
        //print(n+z);
    }
}
  