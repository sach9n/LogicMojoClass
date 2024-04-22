package Week3;

import java.util.Map;

public class CheckAllNSetbits {

    // by using
    public static int isHighestPowerOF2(int n){
       int x= 0;

       while(1<<x <= n){
           x++;
       }
       return x-1;
    }

    public static int CountingAllNsetBits(int n){
        if(n == 0) return 0;
        int x = isHighestPowerOF2(n);
        int value= (int) ((x * Math.pow(2, x-1)) +
                           ((n - Math.pow(2, x)) + 1) +
                          CountingAllNsetBits(n-(int)Math.pow(2, x)));
      return value;
    }

    public static void main(String[] args) {

        System.out.println(isHighestPowerOF2(10));
        System.out.println(CountingAllNsetBits(10));

    }

}
