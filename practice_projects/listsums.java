import java.util.*;
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        int [] numarr = {10, 15, 3, 7};
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int m =0; m < (numarr.length); m++) {
            for (int z = m+1; z <(numarr.length); z++){
                if ((numarr[m] < k) && (numarr[z] < k)){
                    if ((numarr[m] + numarr[z]) == k){
                        print (numarr[m]+" "+numarr[z]);
                    }
                }
            }
        }
    }
}
  