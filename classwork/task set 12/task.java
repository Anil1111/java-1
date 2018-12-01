import java.util.*;
public class task{
    public static void main(String[] args){
        Person p1 = new Person("alisa", 2003);
        Person p2 = new Person("bob",2002);
        Person p3 = new Person("maha", 2001);
        Person[] brr = {p2, p1, p3};

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        
        System.out.println(p1.getBirthYear());
        System.out.println(p2.getBirthYear());

        System.out.println(p1.isFemale());
        System.out.println(p2.isFemale());

        System.out.println(Person.getOlder(p1,p2));

        System.out.println(Person.getOldest(null));

        System.out.println(Person.getYoungestFemale(brr));
    }
}
public class Person{
    private String name;
    private int birth;
    Person (String name){
        this(name, 1990);
    }
    Person (String name, int birth){
        this.name = name;
        this.birth = birth;
    }
    public String getName(){
        return name;
    }
    public int getBirthYear(){
        return birth;
    }
    public boolean isFemale(){
        return (name.charAt(name.length()-1)=='a')? true:false;

    }
    public static Person getOlder(Person p1, Person p2){
        return (p1.getBirthYear() < p2.getBirthYear())? p1:p2;
    }
    public static Person getOldest(Person [] arr) throws Exception{ // deliver nul as an arg, empty arr
        if (arr == null){
            throw new Exception("input must be an array of class person");
        }
        if (arr.length == 0){
            return null;
        }
        Person oldest = arr[0];
        for (Person p : arr) {
            if (p != null){
                oldest = (p.getBirthYear() < oldest.getBirthYear())?p :oldest;
            }
        }
        return oldest;
    }
    public static Person getYoungestFemale(Person[] arr){
        Person yongest = arr[0];
        boolean haswomen = false;
        for (Person p : arr) {
            if (p.isFemale()){
                yongest = (p.birth > yongest.birth)?p :yongest;
                haswomen = true;
            }
        }
        if (haswomen){
            return yongest;
        }
        else {
            return null;
        }
    }
    @Override
    public String toString() {
        return "Person: "+this.name+" born on: "+ this.birth;
    }
}