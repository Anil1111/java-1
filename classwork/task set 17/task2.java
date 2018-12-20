import java.util.*;
import java.io.*;
public class task2{
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("/Users/Ro991/Desktop/University/java/classwork/helloworld.txt"));
            while (input.hasNextLine())
            {
            System.out.println(input.nextLine());
            }
        }catch (Exception e ){
            
        }
        
    }
}