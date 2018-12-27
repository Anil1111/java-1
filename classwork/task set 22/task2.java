public class task2{
    public static void main(String[] args){
        Person john = new Person("John");
        john.buys("Ford", 20000)
            .buys("Opel", 16000)
            .buys("Fiat", 12000)
            .showCars();
        System.out.println();
        john.showCarsRev();
        System.out.println();
        System.out.println("Total price of " +
                john.getName() + "'s cars: " +
                john.getTotalPrice());
        System.out.println("Does " + john.getName() +
                " have a ford? " + john.hasCar("ford"));
        System.out.println("Does " + john.getName() +
                " have a bmw? " + john.hasCar("bmw"));
        System.out.println(john.getName() + "'s most " +
                "expensive car is " + john.mostExpensive());
    }
}
public class Car {
    private String make;
    private int price;
    private Car next;
    public Car(String make, int price, Car next) {
        this.make = make;
        this.price = price;
        this.next = next;
    } 
    public Car(String make, int price){
        this(make, price, null);
    }
    public String getMake() {
        return make;
    }
    public int getPrice() {
        return price;
    }
    public Car getNext() {
        return next; 
    }
    public void showCars(){
        System.out.println("Showing cars");
        Car tmp = this;
        while(tmp!= null){
            System.out.print(tmp+" ");
            tmp = tmp.getNext();
        }
    }
    public void showCarsRev(){
        Car c = this;
        showRev(c);
    }
    private void showRev(Car c) {
        if (c.getNext() != null) showRev(c.getNext());
        System.out.print(c+" ");
    }
    @Override
    public String toString() {
        return ""+make +" "+ price ;
    }
}
public class Person {
    private String name;
    private Car cars;
    public Person(String name){
        this.name = name;
        cars = null;
    }
    public Person buys(String make, int price){
        if (cars == null){ //if null add first
            cars = new Car(make, price, null);
        }else { // if not null move all by one and add to front
            cars = new Car(make, price, cars);
        }
        return this;
    }
    public String getName(){
        return name;
    }
    public void showCars(){
        cars.showCars();
    }
    public void showCarsRev(){
        cars.showCarsRev();
    }
    public int getTotalPrice(){
        int totalprice = 0;
        Car tmp = cars;
        while (tmp != null) {
            totalprice += tmp.getPrice();
            tmp = tmp.getNext();
        }
        return totalprice;
    }
    public boolean hasCar(String name){
        Car tmp = cars;
        while (tmp != null) {
            if(name.equals(tmp.getMake().toLowerCase())){
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
    public Car mostExpensive(){
        Car tmp = cars.getNext();
        Car mostexpensive = cars;
        while (tmp != null){
            mostexpensive = mostexpensive.getPrice()>tmp.getPrice()?mostexpensive :tmp;
            tmp = tmp.getNext();
        }
        return mostexpensive;
    }
}
