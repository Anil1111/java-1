import com.sun.java.util.jar.pack.ConstantPool.Index;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class task{
    public static void main(String[] args){

    }
}
public class SimpleArrayList{
    int size;
    int cap;
    int [] arr = new int[size];
    static int INITIAL_CAPACITY =0;
    public SimpleArrayList(){
        size = 0;
        cap = INITIAL_CAPACITY;
    }
    public SimpleArrayList(int i){
        size = 1;
        arr[0] = i;
    }
    public SimpleArrayList(int [] arr){ //not done
        size = arr.length;
        this.arr = arr;
    }
    public SimpleArrayList(SimpleArrayList arrlist){
        arr = arrlist.arr;
    }
    public int size(){
        return size;
    }
    public void clear(){
        size = 0;
        cap = INITIAL_CAPACITY;
        arr = new int[size];
    }
    public void trim(){
        arr1 = new int[size];
        arr1 = arr;
    }
    public SimpleArrayList insert(int ind, int [] other) throws IndexOutOfBoundsException{ // not done
        if (ind > size || ind < 0){
            throw new IndexOutOfBoundsException();
        }
        return this;
    }
    public SimpleArrayList insert(int ind, int e){ //the first inserts a single element e at position ind;

    }
    public SimpleArrayList append(int e){ //the second appends a single element e at the end of the vector;

    }
    public SimpleArrayList append(int [] e){ //the third appends to the vector elements from the array passed as an argument;
        
    }
    public SimpleArrayList append(SimpleArrayList a){ //the fourth appends to the vector elements from another vector passed as an argument.

    }
    public int get(int ind)throws IndexOutOfBoundsException{//returns ind-th element of the vector

    }
    public SimpleArrayList set(int ind, int val)throws IndexOutOfBoundsException{//mo- difies the element under index ind assigning the value val to it

    }
}