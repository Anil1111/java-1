import java.io.*;
public class fractilecompression{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("/Users/Ro991/Desktop/University/java/practice_projects/part1pairs/sign_1.ppm");// path
            int wrt = fis.read();
            boolean header = true;
            int count = 0;
            while(header){
                System.out.print((char)wrt);
                wrt = fis.read();
                if (count < 2){
                    if (((char)wrt) == ' '){
                        count++;
                        //System.out.println();
                    }
                } else {
                    header = false;
                }
            }/*
            while(wrt!= -1){
                System.out.print(wrt+"");
                wrt = fis.read();
            }*/
        } catch (FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex); 
        }
    }
}