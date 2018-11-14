import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        RecIter RecIter = new RecIter();
        System.out.println(RecIter.fiboR(45));
        System.out.println(RecIter.fiboI(45));
        System.out.println(RecIter.factR(10));
        System.out.println(RecIter.factI(10));
        System.out.println(RecIter.gcdR(12125,40643));
        System.out.println(RecIter.gcdI(12125,40643));
        int[] a = {3,8,2,9,7};
        System.out.println(RecIter.maxElem(a,0,a.length));
        RecIter.reverse(a,0,a.length);
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.print("Is 'radar' a palindrom? ");
        System.out.println(RecIter.isPalindrom("radar"));
        System.out.print("Is 'rover' a palindrom? ");
        System.out.println(RecIter.isPalindrom("rover"));
    }
}
public class RecIter {
    public static int fiboR(int n){
        if (n >= 0 && n < 2) {
            return n;
        }
        else {
            return (fiboR(n-1)+fiboR(n-2));
        }
    }
    public static int fiboI(int n){
        int fibonumber =1;
        int nbefore = 1;
        if (n >= 0 && n < 2) {
            return n;
        }
        else {
            for (int z = 0; z < n-2; z++){
                fibonumber += nbefore;
                nbefore = fibonumber;
            }
            return fibonumber;
        }
    }
    public static int factR(int n){
        // 1! = 1 2! = 2 3! = 6
        int result;
        if(n==0 || n==1)
            return 1;
        result = factR(n-1) * n;
        return result;
    }
    public static int factI(int n){
        int sum = 1;
        for (int x = 1; x < n+1 ; x++){
            sum = x*sum;
        }
        return sum;
    }
    public static int gcdR(int a, int b){
        if (b != 0)
            return gcdR(b, a % b);
        else
            return a;
    }
    public static int gcdI(int a, int b){
        if (a == 0) {
            return b;
        }
        else {
            while (a > 0) {
                if (a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                else if (a == b){
                    return b;
                }
                else {
                    b = b-a;
                }
            }
        }
        return b;
    }
    public static int maxElem(int[] arr, int from, int to){ //figure out
        int max = 0;
        if (arr.length>0){
        }
        else {
            return max;
        }
    }
    public static void reverse(int[] arr, int from, int to){

    }
    public static boolean isPalidrom(String s){

    }
}