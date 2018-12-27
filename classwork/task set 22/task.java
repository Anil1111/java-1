public class task{
    public static void main(String[] args){
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
    private int quantity;
    private String name;
    public Product(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public int getQuant(){
        return quantity;
    }

}
public class Box{
    private String id;
    private Product [] prods;
    public Box(String id, Product [] prods){
        this.id = id;
        this.prods = prods;
    }
    public Product [] getProducts(){
        return prods;
    }
}
public class Storage{
    private Box [] boxes;
    public Storage(Box [] boxes){
        this.boxes = boxes;
    }
    public int totQuant(String name){
        int quant =0;
        for (Box b : boxes) {
            for (Product p : b.getProducts()) {
                if (p.getName().equals(name)){
                    quant += p.getQuant();
                }
            }
        }
        return quant;
    }
}
