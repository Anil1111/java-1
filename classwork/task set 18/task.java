public class Computers {
    public static void main (String[] args) {
        CalculatingMachine[] arr = {
                new Computer("Cray"),
                new CalculatingMachine("Abacus"),
                new Calculator("HP")
        };
        CalculatingMachine.printRes(arr, 21, 7);
    }
}

public class CalculatingMachine {
    private String name;

    public CalculatingMachine(String a) {
        name = a;
    }

    public String calculate(double x, double y) {
     
        return "'+':" + (x + y) +";";
    }

    public static void printRes(CalculatingMachine[] a,
                                 double x, double y) {
        for( CalculatingMachine i : a) {
            System.out.println(i.name + "(" +x+","+y+") ->" + i.calculate(x,y));
        }
    }
}
public class Calculator extends CalculatingMachine {
    public Calculator(String s){
        super (s);
    }
    @Override
    public String calculate(double x, double y) {
       return  super.calculate(x,y) + "'-'" + (x-y) +";";
    }
}
public class Computer extends Calculator {

    public Computer(String d){
        super(d); 
    }

    @Override
    public String calculate(double x, double y) {
       return  super.calculate(x,y) + "'*'" + (x*y) + ";'/'" + (x/y) +";";
    }
}

