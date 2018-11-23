import java.util.*;
public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        Square[] sqs = {new Square(2), new Square(1),
                        new Square(3), new Square(2)};
        for (Square s : sqs)
            System.out.print(s + " ");

        System.out.print("\nAreas: ");
        for (Square s : sqs)
            System.out.print(s.getArea() + " ");
        System.out.print("\nPerimeters: ");
        for (Square s : sqs)
            System.out.print(s.getPerimeter() + " ");

        Circle[] crs = {new Circle(2), new Circle(1),
                        new Circle(3), new Circle(2)};
        Square[] squares = Circle.getSquares(crs);
        System.out.println( "\nPerimeters of squares " +
                            "from circles: ");
        for (Square s : squares)
            System.out.printf("%.2f ", s.getArea());
        System.out.println();
    }
}
public class Square {
    private double side;
    private Object circle;
    public Square(double side){
        this.side = side; 
    }
    public Square(Circle p){
        Circle z = p;
        //System.out.println("area "+ z.getArea());
        double input = Math.sqrt((z.getArea()/Math.PI));
        //System.out.println("input "+input);
        System.out.println("new circle radius: "+input);
        Circle circle = new Circle(input);
    }
    public double getSide(){
        return side;
    }
    public double getArea(){
        return (side*side);
    }
    public double getDiagonal(){
        return (Math.sqrt((Math.pow(side,2)*2)));
    }
    public double getPerimeter(){
        return side*4;
    }
    @Override
    public String toString() {
        return "A square with sides of: " + side;
    }
    public Object getInscribedCircle(){
        Circle c = new Circle(side/2);
        return c;
    }
    public Object getCircumscribedCircle(){
        Circle c = new Circle(getDiagonal()/2);
        return c;
    }
}
public class Circle {
    private double radius;
    private Object square;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(Object o){
        Square square = new Square(Math.sqrt(getArea()));
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return (Math.PI*Math.pow(radius,2));
    }
    public double getPerimiter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "A cirlce of radius: " + radius;
    }
    public Object getInscribedSquare(){
        double diam = getRadius()*2;
        double side = (Math.pow(diam,2)/2);
        Square c = new Square(Math.sqrt(side));
        return c;
    }
    public Object getCircumscribedSquare(){
        Square c = new Square(getRadius()*2);
        return c;
    }
    public static Square [] getSquares(Circle[] arr){
        //[c1,c2,c3,c4]
        Square [] arrf = new Square [arr.length];
        for (int z = 0; z < arr.length; z++){
            System.out.println("value "+arr[z]);
            arrf[z] = new Square(arr[z]);
        }
        System.out.println(Arrays.deepToString(arrf));
        return arrf;
    }
}
  