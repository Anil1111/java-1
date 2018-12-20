import java.util.*;
public class task1{
    public static void main (String[] args){

    }
}
public class Square {
    private double side;
    public Square(double side){
        this.side = side; 
    }
    public double getSide(){
        return side;
    }
    public double getArea(){
        return (side*side);
    }
    public double cubevolume(){
        return Math.pow(side, 3);
    }
    public Cylinder showCylinder(){
        Cylinder c = new Cylinder(this);
        return c;
    }
    @Override
    public String toString() {
        return "A square with sides of: " + side;
    }
}
public class Cylinder {
    private double radius;
    private double height;
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public Cylinder (Square s){
        Cylinder c = new Cylinder(s.getSide/2,s.getSide);
    }
    public void show(Square s){
        System.out.print(s);
    }
    @Override
    public String toString() {
        return "Cylinder base surface area " + Math.PI*Math.pow(radius, 2)+"\n"+ "Cylinder volume"+ Math.PI*Math.pow(radius, 2);
    }
}
public class MethodCarrier{
    public static draw(int edge){
        for (int k = 0; k < n; k++){
            
        }
    }
}