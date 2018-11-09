public class FindMiss {

    public static void main(String[] args) {
        int[] arr = { 4,3,4,3,6,7,4,8,2,9 };
        int[] brr = { 2,3,6,8,1,5 };

        L: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                    if (arr[i] == brr[j]) {
                        continue L;
                    }
            }
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k])
                    continue L;
            }
                System.out.print(arr[i]);
        }
    }
}

// other solution https://hastebin.com/peyabotani.java

/* my version
int [] arr = {4,3,4,3,6,7,4,8,2,9};
        int [] drr = {2,3,6,8,1,5};
        int match = 0;
        int equalnum = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int z = 0; z < drr.length; z++) {
                if (arr[x] == drr[z]) {
                    match = 1;
                    equalnum = arr[x];
                    print(arr[x]);
                }
            }
            for (int u = 0; u < arr.length; u++) {
                if (equalnum == arr[u]) {

                }
                else {
                    //print(arr[u]);
                }
            }
            match = 0;
       }
       */