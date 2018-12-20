import java.util.Scanner;
public class Ticktacktoe{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 0b0_0001_0001_0_0001_1111;// fist 1-9 bits - null or filled //0 0001 0001 0 0001 1111
        int p;                             // 10-18: 0 - 0, 1 - x
        a = 0;
        boolean okay= true;
        int count = 0;
        int x = 0; 
        while(okay){
            System.out.println("a at the beginning of loop: "+a);
            for( int k = 0; k < 5; k++){ //print grid 
                if(k == 0 || k == 2 || k == 4) {  //??
                    for( int y = 0; y < 5; y++){
                        if(y == 0 || y == 2 || y == 4) { //??
                            if((a & (1 << x)) != 0 ) {
                                if((a & (1 << (x+9))) !=0){ //error
                                    System.out.print("o");
                                } else {
                                    System.out.print("x");
                                }
                            }
                            System.out.print(" ");//logic
                            x++;
                        } else {
                            System.out.print(" | ");
                        }
                    }     
                    System.out.println();
                } else {
                    System.out.print("----------");
                    System.out.println();
                }
            }
            p = scan.nextInt();
            System.out.println("count: "+count);
            if(count % 2 == 0){
                System.out.println("a before: "+a);
                a += (1 << (p-1));
                a += (1 << (p+8));
                System.out.println("a after: "+a);
            } else {
                System.out.println("a before: "+a);
                a += (1 << (p-1));
                System.out.println("a after: "+a);
            }   
        count++;    
        if(count == 8){
            okay = false;
        } 
    }
    }
}

    