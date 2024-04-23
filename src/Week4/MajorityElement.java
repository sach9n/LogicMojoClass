package Week4;

import java.util.HashMap;

public class MajorityElement {


    //Approach1 HashMap(On + On)
   public static void hashMapApproach(int[]num) {
       HashMap<Integer, Integer> map = new HashMap<>();

       for (int x : num) {
           map.put(x, map.getOrDefault(x, 0) + 1);

           if (map.get(x) > num.length / 2) {
               System.out.println(x);
               return;
           }
       }

   }

   // More Optimized one is MorreVoiting Alogrithim;
    public static  void MorreVoitingAlgorithm(int []arr){
       int maj = arr[0];
       int count = 1;
       for(int value : arr) {
            if (value == maj) {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                maj = value;
                count = 1;
            }
        }
            count = 0;
            for(int x:arr){
                if(maj==x){
                    count++;
                }
            }

          if(count > arr.length/3){
              System.out.println(maj);
          }else System.out.println("no maj element exits");
        }



  // majority for sorted value
    public static void CheckForMajority(int[]arr){
       int midIndex = arr.length/2;
       int value = arr[midIndex];
       int count = 0;

      for(int x:arr){
          if(x== value){
              count++;
          }
      }
      if(count > arr.length/2){
          System.out.println(value);
      }
   }

    public static void main(String[] args) {
       int[]repeated = {2,5,2,5,5,5,2,2};
       int[]sortedRepeat = {1,1,2,2,2,2,2,3};
   //  hashMapApproach(repeated);
   // MorreVoitingAlgorithm(repeated);
     CheckForMajority(sortedRepeat);
   }
}
