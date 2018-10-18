import java.util.Scanner;
public
    class compare_3var_v2 {
        static void print (Object arg) {
            System.out.println(arg);
        }
        public static void main(String[] args) {
            print("Enter 3 values to compare:");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int minVal = (a < b) ? a : b;
            minVal = (minVal < c) ? minVal : c;
            print("Minimum value is: "+minVal);
            scan.close();
        }
    }