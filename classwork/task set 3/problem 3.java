import java.util.*;

public class Classwork {
    static void print(Object obj) {
    System.out.println(obj);
    }
    public static void main(String[] args){
        info(encode(130999,101,7777,99,7000,6));
    }
    public static long encode(int caller,int caller_zone,int callee,int callee_zone,int duration,int tariff) {
        long encoded;
        //temps for shifting
        int callertemp = caller;
        int caller_zonetemp = caller_zone;
        int calleetemp = callee;
        int callee_zonetemp = callee_zone;
        int durationtemp = duration;
        int tarifftemp = tariff;
        //shifts in temps
        callertemp <<= (bitcheck(caller, 17));
        callertemp >>>= (bitcheck(caller, 17));
        caller_zonetemp <<= (bitcheck(caller_zone, 7));
        caller_zonetemp >>>= (bitcheck(caller_zone, 7));
        calleetemp <<= (bitcheck(callee, 17));
        calleetemp >>>= (bitcheck(callee, 17));
        callee_zonetemp <<= (bitcheck(callee_zone, 7));
        callee_zonetemp >>>= (bitcheck(callee_zone, 7));
        durationtemp <<= (bitcheck(duration, 13));
        durationtemp >>>= (bitcheck(duration, 13));
        tarifftemp <<= (bitcheck(tariff, 3));
        tarifftemp >>>= (bitcheck(tariff, 3));
        //storing in a long
        encoded = callertemp;
        encoded <<= 7;
        encoded += caller_zonetemp;
        encoded <<= 17;
        encoded += calleetemp;
        encoded <<= 7;
        encoded += callee_zonetemp;
        encoded <<= 13;
        encoded += durationtemp;
        encoded <<= 3;
        encoded += tarifftemp;
        return encoded;
    }
    // takes in an int n and int bitlength where bitlength is the biggest length of int in bits
    // outputs  difference between max int length in bits and current length
    public static int bitcheck (int n, int bitlength) {
        int count = 0;
        int mask = 1;
        for (int i=1; i<bitlength; i++){
            if( (n & (mask << i)) != 0)
                count = i;
        }
        count += 1;
        return (bitlength-count);
    }
    //breaks down the long for all respective details
    public static void info(long res) {
        {
            long restemp = res;
            long caller = (restemp >>> 47);
            print("Caller: "+caller);
        }
        {
            long restemp =res;
            restemp <<= 17;
            long caller_zone = (restemp >>> 57);
            print("Caller_zone: "+caller_zone);
        }
        {
            long restemp = res;
            restemp <<= 24;
            long callee = (restemp >>> 47);
            print("Callee: "+callee);
        }
        {
            long restemp = res;
            restemp <<= 41;
            long callee_zone = (restemp >>> 57);
            print("Callee_zone: "+callee_zone);
        }
        {
            long restemp = res;
            restemp <<= 48;
            long duration = (restemp >>> 51);
            print("Duration: "+duration);
        }
        {
            long restemp = res;
            restemp <<= 61;
            long tariff = (restemp >>> 61);
            print("Tariff: "+tariff);
        }
    }
}
  