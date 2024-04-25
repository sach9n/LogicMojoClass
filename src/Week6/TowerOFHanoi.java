package Week6;

import java.time.chrono.IsoEra;

public class TowerOFHanoi {

    public static void  towerOfhanoi(int n, char srcPeg, char desPeg , char auxPeg){

          if(n==1){
              System.out.println("Move disc 1 " + srcPeg + " to  " + desPeg);
              return;
          }

          towerOfhanoi(n-1,srcPeg,auxPeg,desPeg);
          System.out.println("Move " + n + " from " + srcPeg + " to " + desPeg);
         towerOfhanoi(n-1, srcPeg,desPeg,auxPeg);
    }

    public static void main(String[] args) {
        int noDiscs = 2;
        char srcPeg = 'A';
        char auxPeg = 'B';
        char desPeg = 'C';

        towerOfhanoi(noDiscs,srcPeg,desPeg,auxPeg);
    }
}
