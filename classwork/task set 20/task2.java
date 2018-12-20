import java.util.*;
public class task2{
    public static void main(String[] args){
        Rocket r = new Rocket("My rocket", 10000)
        try {
            r.launch();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
public class Rocket{
    String name;
    int fuelWeight;
    public Rocket(String name, int fuelWeight){
        this.name = name;
        this.fuelWeight = fuelWeight;
    }
    public void refill(){
        Random rnd = new Random();
        fuelWeight = rnd.nextInt();
    }
    public void launch() throws Exception{
        if (fuelWeight <= 1000){
            throw new Exception("launch cancelled, fuel too low");
        }
    }
}