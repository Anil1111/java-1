public class task1{
    public static void main(String[] args){
        Patient[] patients = {
            new IllHead("Johny"),
            new IllLeg("Eddy"),
            new IllDyspepsia("Manny")
        };
        for (Patient p : patients) {
            System.out.println("Patient: "+
                p.name() + '\n' + "Illness:  " +
                p.illness() + '\n' + "Treatment: "  +
                p.treatment() +"\n\n");
        }
    }
}
public class Patient{
    private String name;
    private String illness;
    private String treatment; 
    public Patient(String s){
        name = s;
    }
    public Patient (String s, String b){
        name = s;
        illness = b;
        if (illness.equals("head")){
            treatment = "aspirin";
        }else if (illness.equals("leg")){
            treatment = "plaster";
        } else {
            treatment = "coal";
        }
    }
    public String name(){
        return name;
    }
    public String illness(){
        return illness;
    }
    public String treatment(){
        return treatment;
    }
}
public class IllHead extends Patient{
    public IllHead(String s){
        super(s, "head");
    }
}
public class IllLeg extends Patient{
    public IllLeg(String s){
        super(s, "leg");
    }
}
public class IllDyspepsia extends Patient{
    public IllDyspepsia(String s){
        super(s, "dyspepsia");
    }
}