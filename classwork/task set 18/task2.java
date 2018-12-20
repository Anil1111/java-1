public class task2{
    public static void main(String[] args){
        Student s = new Professor(1,1990, "geography");
        Professor p = new Student(1,1999, 10);
        Person sPerson = new Student(1,1999, 10);
        Person pPerson = new Professor(1,1990, "geography");
        Student personA = new Person("jack", 2000);
        Professor personB = new Person("mike", 1500);
    }
}
public class Person{
    private int name;
    private int yearOfBirth;
    public Person (int name, int yearOfBirth){

    }
    public int getAge(){
        return 2018-yearOfBirth;
    }
}

public class Student extends Person{
    private int grade;
    public Student(int n, int year, int grade){
        super(n, year);
        this.grade = grade;
        
    }
}
public class Professor extends Person{
    private String specialisation;
    public Professor(int n, int year, String specialisation){
        super(n, year);
        this.specialisation = specialisation;
        
    }
}