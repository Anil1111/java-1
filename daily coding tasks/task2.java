import java.util.*;
/*
Given an array of integers, return a new array such that each element at index i of the new array 
is the product of all the numbers in the original array except the one at i.
*/
public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        int [] input = {1, 2, 3, 4, 5};
        int [] output = new int [input.length];
        for (int z = 0; z < input.length; z++){
            int total = 1;
            for (int k = 0; k < input.length; k++){
                if (k != z ){
                    total *= input[k];
                }
            }
            output[z] = total;
        }
        print(Arrays.toString(output));
    }
}
  