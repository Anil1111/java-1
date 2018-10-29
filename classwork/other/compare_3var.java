import java.util.Scanner;
public 
  class compare_3var {
    public static void main(String[] args){
    System.out.println("Enter 3 values: ");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    System.out.println("Your values: \n" + a +"\n"+b +"\n"+c);
    if (a < b) {
      if (a < c){
        System.out.println("Smallest value " + a);
      }
      else {
        System.out.println("Smallest value " + c);
      }
    }
    else
      if (b < c) {
        System.out.println("Smallest value " + b);
      }
      else {
        System.out.println("Smallest value: " + c);
      }
  scanner.close();
  }
}
