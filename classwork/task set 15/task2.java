public class HarryPotter {
    public static void main(String[] args) {
        int amountOfHorcruxes = 8;
        Voldemort youKnowWho = new Voldemort(amountOfHorcruxes);// first object 

        String name = "Harry";
        String familyName = "Potter";
        RegularPerson harry = youKnowWho.killLilly();// Prints something sad
        
        Dumbledore albus = new Dumbledore();
        Wizard harryWizard = albus.youAreWizard(harry);

        while(youKnowWho.isAlive()) {
            harryWizard.destroyHorcruxOf(youKnowWho);
            harryWizard.tryToDefeat(youKnowWho);// success, if Voldemort has no Horcruxes 
        }

        System.out.println("Happy ending");
        
    }
}
public class Voldemort{
    private int horcruxes;
    public Voldemort(int k){
        horcruxes = k;
    }
    public RegularPerson killLilly(){
        System.out.println("dead = nogood");
        return new RegularPerson();
    }
    public boolean isAlive(){
        if(horcruxes > 0){
            return true;
        } else {
            return false;
        }
    }
    public void destory(){
        horcruxes--;
    }
}
public class RegularPerson{

}
public class Dumbledore{
    public Wizard youAreWizard(RegularPerson p){
        return new Wizard(p);
    }
}
public class Wizard{
    private RegularPerson person;
    public Wizard(RegularPerson p){
        person = p;
    }
    public void destroyHorcruxOf(Voldemort v){
        v.destory();
    }
    public void tryToDefeat(Voldemort v){
        v.isAlive();
    }
}