import java.util.*;
public class task{
    public static void main(String [] args){
        Car car = new Car();
        while (true) {
            try {
                car.drive100km();
            }
            catch(NotEnoughGas e) {
                System.err.println(e.getMessage());
                car.fill();
            }
        }
    }
}
public class Car{
    public int fuel = 35;
    private int dtraveled = 0;
    public void fill(){
        Random rnd = new Random();
        if (Math.random() < .1){
            throw new Explosion();
        }else {
            fuel += (rnd.nextInt(20)+15);
        }
        
    }
    public void drive100km() throws NotEnoughGas{
        if (fuel < 10){
            throw new NotEnoughGas(fuel);
        }else {
            while (fuel > 10){
                fuel -= 10;
                dtraveled +=100;
                System.out.println(dtraveled+"km driven, "+fuel+" liters left");
            }
            //System.out.println("Distance traveled: "+dtraveled);
        }
    }
}
public class NotEnoughGas extends Exception{
    private int fuel;
    public NotEnoughGas(int a){
        super();
        fuel = a;
        
    }
    public String getMessage(){
        return "Only "+fuel+" liters. Must fill the tank";
    }
}
public class Explosion extends RuntimeException{
    public Explosion(){
        super("Booom");
    }
}