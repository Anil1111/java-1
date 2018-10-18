import java.util.*;

public class Classwork {
    static void print(Object obj) {
        System.out.print(obj);
    }
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int userinput = scan.nextInt();
    if (userinput < 0) {
        print("Error");
    }
    else {
        for (int i = userinput; i > 0; i -= 2) {
            for (int p = (userinput- i)/2; p> 0; p--){
                print(" ");
            }
            for (int j = i; j > 0; j--) {
                print("*");
            } 
            print("\n");
            }
        }   
    }
}
  