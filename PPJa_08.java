import java.util.*;


public
    class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(),
            b = in.nextInt(),
            c = in.nextInt(),
            d = in.nextInt();

        for( int n=-5; n <= 5; n++){

            boolean set1 = (n >= a && n <= b);
            boolean set2 = (n >= c && n <= d);

            System.out.println(
                    (n >= 0 ? "+" : "") + n +
                    ": inSum?" + (set1 || set2) +
                    "; inIntersect?" + (set1 && set2) +
                    "; inSymDiff?" + ((set1 || set2) && !(set1 && set2))
            );
        }

// =================================================

        int n = in.nextInt();

        int mask = 1;

        int count = 0;
        for( int i=0; i<32; i++){
            if( (n & (mask << i)) != 0)
                count++;
        }
        System.out.println(count);

        if( (n & 0b1000000) != 0)
            ;
    }
}
