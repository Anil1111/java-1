public class task1 {
    public static void main(String[] args) {
        Person johnP = new Person("John"), maryP = new Person("Mary");
        
        BankCustomer john = new BankCustomer(johnP);
        BankCustomer mary = new BankCustomer(maryP);

        john.getAccount().deposit(1000);
        mary.getAccount().deposit(2000);

        john.getAccount().transfer(mary.getAccount(),500);

        mary.getAccount().withdraw(1000);

        System.out.println(john);
        System.out.println(mary);

        Account.setInterestRate(4.5);

        john.getAccount().addInterest();
        mary.getAccount().addInterest();
        
        System.out.println(john);
        System.out.println(mary);
    }
}
public class Person{
    private String name;

    public Person(String name){
        this.name = name; 
    }

    public String getName(){
        return name;
    }
}//customer more than 1 acc
public class BankCustomer{
    private Person a;
    private Account b;
    public BankCustomer(Person a){
        this.a = a;
        this.b = new Account(a);
    }
    
    public Account getAccount(){
        return b;
    }
    @Override
    public String toString() {
        return "Customer: " + a.getName() + ", balance: " +  b.getBalance();
    }
}
public class Account{
    private double balance = 0; 
    private Person a;
    private static double interest;
    public Account(Person a){
        this.a = a;
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double d){
        return balance += d;
    }

    public double withdraw(double d){
        return  balance -= d;
    }

    public void transfer( Account a, double d){
        a.deposit(d);
        withdraw(d);
    }
    
    public static void setInterestRate(double b){
        interest = b;
    }



    public void addInterest(){
       deposit(balance * interest);
    }
}