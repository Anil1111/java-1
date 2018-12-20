public class task {
    public static void main (String[] args){
        System.out.println(norm("caravaggio"));
            System.out.println(norm("VERMEER"));
            System.out.println(init("johann sebastian bach"));
            System.out.println(init("i. babeL"));
            System.out.println(init("jorge LUIS BORGES"));
            System.out.println(init("WOLFGANG a. mozart"));
            System.out.println(tr("November 2016",
                        "abcdefghijklmnopqrstuvwyz",
                        "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
            System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }
    public static String norm(String name){
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }
    public static String init(String name){
        String [] arr = name.split(" ");
        String out; 
        String temp;
        out = arr[0].substring(0, 1).toUpperCase() +". ";
        if (arr.length ==3){
            out = out.substring(0, 3) + arr[1].substring(0, 1).toUpperCase()+". ";
            out = out.substring(0, 6) + norm(arr[2]); //J. K. Peterson
        }
        else {
            out = out.substring(0, 3) + norm(arr[1]);
        }
        return out;
    }
    public static String tr(String s, String from, String to){
        String [] arr = s.split("");
        for (int z = 0; z < arr.length; z++){
            if (from.contains(arr[z])){
                int charindex = from.indexOf(arr[z]);
                char change = to.charAt(charindex);
                arr[z] = String.valueOf(change); // String z = ""+change;
            }
        }
        String out = "";
        for (String k : arr) {
            out = out.substring(0, out.length())+k.substring(0);
        }
        return out;
    }
}