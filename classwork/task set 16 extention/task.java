public class task{
    public static void main(String[] args){
    char[][] passwords =  {
        "AbcDe93".toCharArray(),
        "A1b:A1b>".toCharArray(),
        "Ab:Acb<".toCharArray(),
        "abc123><".toCharArray(),
        "Zorro@123".toCharArray()
    };
    for(int p = 0; p < passwords.length; p++){
        boolean exp = false;
        boolean hasdigit = false;
        try {
            if (!(passwords[p].length< 8)){ //check length
                throw new Exception();
            }
            for (int k = 0; k< passwords[p].length; k++){ // loops over chars
                if (Character.isDigit(passwords[p][k])){
                    hasdigit = true;
                }
            }
            if (!hasdigit) { //check 
                throw new Exception();
            }            
        } catch (Exception e) {
            //TODO: handle exception
        }finally {
            if (exp){
                System.out.println("OK")
            }
        }
    }
    }
}