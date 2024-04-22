package Week4;

import java.util.Arrays;
import java.util.HashMap;

public class MIssingNumber {
    // Aproach1 sum all the number
    public static void SumApproach(int[]n){
        //  TC O(n)
         int sum = 0;
         int ArraySum = 0;
         int diff = 0;
         int num = n.length+1;
         for(int x : n){
             ArraySum += x;
         }

         for(int i = 1; i <= num;i++){
            sum += i;
        }
         diff = sum - ArraySum;

        System.out.println(diff);
    }

    // brute force  Approach
    //TC  O(n)^2 // not possible for unsorte array you have to sort it and then proced with it
//    public static int nestedLoopApproach(int[] arr) {
//        int num = 8; // Assuming the array contains numbers from 1 to num - 1
//
//        // Iterate through each number from 1 to num - 1
//        for (int i = 1; i < num; i++) {
//            boolean found = false; // Initialize a flag to track whether the number is found in the array
//            // Iterate through each element in the array
//            for (int x : arr) {
//                if (x == i) {
//                    found = true; // Set the flag to true if the number is found in the array
//                    break; // No need to continue searching if the number is found
//                }
//            }
//            // If the number is not found in the array, it is the missing number
//            if (!found) {
//                return i;
//            }
//        }
//        // If no missing number is found, return -1
//        return -1;
//    }



    // Aproach3 O(nlogn)approach
     // does not work for unsorted once so just avoid it
    public static int Approach3(int[]arr){

       int n = 8;
        for(int i = 0; i <= n;i++){
            if(i+1 != arr[i]){
                return i+1;
            }

        }
       return  -1;
    }



    // Xor Approach and TC =  log(logn);
    public static void xorApproach(int[]num){
        int sum = 0;
        int n = num.length +1;
        for(int x : num){
             sum = sum ^ x;
        }

        for(int i = 0; i <= n;i++){
            sum = sum^i;
        }

        System.out.println(sum);
    }



    public static void main(String[] args) {
        int[]nums = {1,2,4,5,6,3,7};
        //SumApproach(nums);
        xorApproach(nums); // This approach will work for one missing value

    }

}
