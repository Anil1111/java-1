public class CarPerson{
    public static void main(String[] args) {
        Car c1 = new Car("M1 Shevrole", 2000);
        Car c2 = new Car("A7 Audi", 3000);
        Person p1 = new Person("Jack", c1);
        Person p2 = new Person("Mike", c2);
        Person[] prs = {p1,p2};
        for (Car g : Person.getCars(prs)) {
            System.out.print("Car model: "+g.getMake()+" ");
            System.out.print("Car price: "+g.getPrice()+"\n");
        }
        for (Car p : Person.expensiveCars(prs, 2500)) {
            if (p != null){
            System.out.println("Expensive cars");
            System.out.print("Car model: "+p.getMake()+" ");
            System.out.println("Car price: "+p.getPrice());
            }
        }
    }
}
public class Person{
    private String name;
    private Car car;

    public Person(String name, Car car){
        this.name = name;
        this.car = car; 
    }
    public Car carGet() {
        return car;
    }
    public String personGet() {
        return name;
    }
    public static Car[] getCars(Person[] arr){
        Car[] brr = new Car [arr.length];
        for(int i= 0; i< arr.length; i++){
            brr[i] = arr[i].carGet();
            //System.out.println(arr[i].carGet().getMake());
        }
        return brr;
    }
    public static Car[] expensiveCars(Person[] arr, int a){
        Car[] crr = new Car[arr.length];
        int count = 0;
        for( int i = 0; i< arr.length; i++){
            if(arr[i].carGet().getPrice() >= a){
            crr[i] = arr[i].carGet();
            count++;
            }
        }
        if (count < 0){
            return null;
        }
        return crr;
    }
    @Override
    public String toString() {
        return "Car name: " + carGet().getMake() + " " +"car price: " + carGet().getPrice();    
        }
    }
public class Car{
    private String make;
    private int price;
    public Car(String make,int price ){
        this.make = make;
        this.price = price;
    }
    public String getMake(){
        return make;
    }

    public int getPrice(){
        return price;
    }
}