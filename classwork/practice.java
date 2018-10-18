import java.util.*;

public class practice {
  static void print(Object obj) {
    System.out.println(obj);
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    /*
    double a = scan.nextDouble();
    String operator = scan.next();
    double b = scan.nextDouble();
    String add = "+";
    String subtract = "-";
    String divide = "/";
    String multiply = "*";

    if (operator.equals(add)) {
      print(a+b);
    }
    else if (operator.equals(subtract)) {
      print(a-b);
    }
    else if (operator.equals(divide)) {
      print(a/b);
      System.out.println(a/b);
    }
    else if (operator.equals(multiply)) {
      print (a*b);
    }
    else {
      print("Error");
    }
    

  }
  
    int count = 1;
    int buffer;
    int value = 0;
    int input = scan.nextInt();
    do {
      input = scan.nextInt();
      if (input == value){
        count =+1;
      }
      if (input != value) {
        buffer = input;
        print("Current"+count);
        count = 1;
      }
      input = scan.nextInt();
      } while (input != 0);
      print("Current"+count);
    scan.close();
    */

    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    int maxval = (a > b) ? a : b;
    maxval = ( maxval > c)? maxval : c;
    maxval = (maxval > d)? maxval : d;

    int minval = (a < b)? a:b;
    int tempval = (d < c)? d:c;
    minval = (minval < tempval)? minval:tempval;
    print(maxval-minval);
    scan.close();
    }
  }
  