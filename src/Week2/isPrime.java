package Week2;

import java.util.Arrays;
import java.util.Map;

public class isPrime {
    //O squr(n) time complexity
    // Aproach(1) simple one
    public static void isPrime(int n){
        if(n <= 1) System.out.println("Not a positive number");

        for(int i = 2 ; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                System.out.println(n + " Not a prime number ");
                return;
            }

        }

        System.out.println(n + " " + " is  a Prime number");
    }


    // Optimized and proven approach usign Seive of Erotherosis
    // Counts the number of prime form one to n
    public static  int PrimeCounter(int n){
        // set all the prime is true   // create an array of values and set them all true
        // TC= O(loglog(n));
        // EdgeCase
        if(n <= 1)return 0;
        boolean[] isPrime = new boolean[n+1];
        // set all value to true
        Arrays.fill(isPrime,true);

        // apply the loop
         for(int i = 2;i <= Math.sqrt(n);i++){
             // array has to be travesed
             // now the prime number will be set as true and composite will be set as false
             if(isPrime[i]){
                 for(int j = i * i; j<=n; j= j+i){
                     isPrime[j] = false;
                 }
             }
         }

        int counter=0;
        for(int i=2; i< n; i++){
            if(isPrime[i])counter++;
        }
       return counter;
    }
    public static void main(String[] args) {
        isPrime(27);
        System.out.println(PrimeCounter(9));
    }

}
