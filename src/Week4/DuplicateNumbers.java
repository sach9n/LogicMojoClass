package Week4;

import java.util.HashMap;

public class DuplicateNumbers {

    // Approach1 Xor approach
    public static int XorDuplicate(int []number){

         int num = 8;
         int value = 0;
         int j;
         for( int i :  number){
            value ^= i;
         }
         for(j = 1; j <= num;j++){
             value ^= j ;
         }

         return value;
    }

    // O(logn) // O(n)  space complixity

    public static void  HashMapApproach(int[]number){
        HashMap<Integer,Integer> map  = new HashMap<>();

        for(int i = 0; i < number.length; i++){
            if(map.containsKey(number[i])){
                System.out.println(number[i]);
                return;
            }else {
                map.put(number[i],i);
            }
        }
    }



    public static void main(String[] args) {
        int[] arr = {2,3,1,4,8,5,6,7,6};
        System.out.println(XorDuplicate(arr));
       // HashMapApproach(arr);

    }
}
