import java.util.*;
public class task2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int maxnumber = 0;
        int printnum = 0;
        int change = 1;
        for (int k = 0; k < n; k++){
            maxnumber = k;
            if (k == (n/2)){
                change = -1;
            }
            for (int z = 0; z < n; z++){
                if (z == (n-1) ){
                    System.out.print("0");
                } else {
                    System.out.print(printnum);
                }
                while (maxnumber > printnum){
                    printnum++;
                }
            }
            printnum += change;
            System.out.println();
            maxnumber++;
        }
    }
}