import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    static void square (int size, String chr) {
        int n = size;
        String firstchar = chr;
        String secondchar;
        if (firstchar.equals("*")){
            firstchar = chr;
            secondchar = "o";
        }
        else {
            firstchar = chr;
            secondchar ="*";
        }
        for (int z = 0; z < n; z++){
            for (int i = 0; i < n;i++) {
                if ((i%2)== 0){
                    System.out.print(firstchar+" ");
                }
                else {
                    System.out.print(secondchar+" ");
                }
            }
            System.out.print("\n");
            String temp = firstchar;
            firstchar = secondchar;
            secondchar = temp;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("size: ");
        int size = scan.nextInt();
        System.out.print("start char: ");
        String chr = scan.next();
        square(size, chr);
    }
}
