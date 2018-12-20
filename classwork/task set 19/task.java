public class task{
    public static void main (String[] args) {
        Box box1 = new Box("Box1",
            new Product[]{
            new Product("Carrot",15),
            new Product("Apples",20)
            });
        Box box2 = new Box("Box2",
            new Product[]{
            new Product("Potato",10),
            new Product("Carrot",12)
            });
        Storage sto = new Storage(
                    new Box[]{box1,box2});
        System.out.println("Tot. quantity of product: " +
            sto.totQuant("Carrot"));
    }
}
public class Product{
    public String name;
    public int quantity;
    public Product(String name, int quantity){
    }
}
public class Box{
    private String id;
    private Products [] arr;
    public Box(){
    }
}
public class Storage{
    private Box [] arr; 
    public Storage(){
    }
    public int totQuant(String name){
        for (Box var : arr) {
            if ()
        }
        return
    }
}
