import java.io.FileReader;
import java.io.File;
import java.lang.StringBuilder;
import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        RPNStack stack = new RPNStack();
        try {
            StringBuilder sb = new StringBuilder();
            Scanner scan = new Scanner(new File("/Users/Ro991/Desktop/University/java/classwork/task set 22/file.txt"));
            scan.useDelimiter(" ");
            while (scan.hasNext()){
                String next = scan.next();
                System.out.print(next +" ");
                if (next.equals("+")){
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.push(a+b);
                }else if (next.equals("-")){
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.push(b-a);
                }else if (next.equals("*")){
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.push(a*b);
                }else if (next.equals("/")){
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.push(b/a);
                }else {
                    stack.push(Integer.parseInt(next));
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println();
        System.out.println(stack.pop());
        //stack.showStack();
    }
}
public class RPNStack{
    private Node top = null;
    public void push(double d){
        top = new Node (d,top);
    }
    public double pop(){
        double tmp = top.val;
        top = top.next;
        return tmp;
    }
    public boolean empty(){
        if (top == null){
            return true;
        }
        return false;
    }
    public void showStack(){
        Node tmp = top;
        while (tmp != null){
            System.out.println("Node val "+tmp.val);
            tmp = tmp.next;
        }
    }
}
public class Node{
    protected double val;
    protected Node next;
    public Node (double val, Node next){
        this.val = val;
        this.next = next;
    }
}