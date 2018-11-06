import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.print(obj);
    }
    public static int getRandomNumberInRange(int min, int max) throws Exception {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    static void rmatrix () {
        Scanner scan = new Scanner(System.in);
        print("Input n: ");
        int n = scan.nextInt();
        for (int j = 1; j < (n+1); j++) {
            System.out.printf("%4d",getRandomNumberInRange(-10, 10));
            print(" ");
        }
        print("\n");
        for (int y = 1; y < n; y++) {
            System.out.printf("%4d",getRandomNumberInRange(-10, 10));
            print(" ");
            for (int x = 2; x < (n+1); x++) {
                System.out.printf("%4d",getRandomNumberInRange(-10, 10));
                print(" ");
            }
            print("\n");
        }
        print("\n");
    }
    public static void main(String[] args){
        rmatrix();
    }
}
