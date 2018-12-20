import java.util.*;
public class task {
    public static void main(String[] args ){
        } try {
            raiseArrayIndexOutOfBoundsException();
            raiseFileNotFoundException();
            raiseException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (FileNotFoundException e1){
            System.out.println(e1);
        } catch (Exception e2){
            System.out.println("wrong unit");
        }
    public static void raiseArrayIndexOutOfBoundsException() throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException();
    }
    public static void raiseFileNotFoundException() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
    public static void raiseException() throws Exception{
        throw new Exception();
    }
}