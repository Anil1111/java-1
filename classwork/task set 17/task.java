public class task{
    public static void main(String[] args){
        Rocket r = new Rocket(new Computer(1), new Computer(10));
        try {
            r.start();
        } catch (ComputerErrorException ex) {
            System.out.println("Error"+ ex);
        }
    } 
}
public class Rocket{
    private Computer computer1; //increase by 1 
    private Computer computer2; //increase by 10
    public Rocket(Computer a, Computer b){
        computer1 = a;
        computer2 = b;
    }
    public void start() throws ComputerErrorException{
        //start engines
        int altitute1 = computer1.altitute;
        int altitute2 = computer2.altitute;
        while (altitute1 < 10000 && altitute2 < 10000){
            altitute1 += computer1.counter;
            altitute2 += computer2.counter;
        }
        if (altitute1 == altitute2){
            System.out.println();
        } else{
            throw new ComputerErrorException("computer mismatch alt");
        }
        //cut engines
    } //two aditional fields enable and disable computer1 and comp 2
}
public class Computer{
    public int altitute = 0;
    public int measurment;
    public int counter;
    public Computer (int counter){
        this.counter = counter;
    }
}
public class ComputerErrorException extends Exception{
    public ComputerErrorException(String msg){
        super(msg);
    }
}