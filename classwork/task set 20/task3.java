import java.io.FileReader;
import  java.lang.StringBuilder;
public class task3{
    public static void main(String[] args){
        try {
            FileReader read = new FileReader("/Users/Ro991/Desktop/University/java/classwork/task set 20/file.txt");
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i=read.read()) != -1) {
                sb.append((char)i);
            }
            System.out.println(sb);

        } catch (Exception e){

        }
    }
}