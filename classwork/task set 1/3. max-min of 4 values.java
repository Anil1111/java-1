import java.util.*;

public class practice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int maxval = (a > b) ? a : b;
        maxval = ( maxval > c)? maxval : c;
        maxval = (maxval > d)? maxval : d;

        int minval = (a < b)? a:b;
        int tempval = (d < c)? d:c;
        minval = (minval < tempval)? minval:tempval;
        System.out.println(maxval-minval);
        scan.close();
    }
}