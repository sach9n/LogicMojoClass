package Week4;

import java.util.Arrays;
import java.util.HashMap;

public class PairSum {
    //Two sum
    public static void NestedLoop(int[]arr,int target){
        for(int i =0; i < arr.length;i++){
           for(int j = 0; j < arr.length;j++){
               if(arr[i]+arr[j]==target){
                   System.out.println("Pair Found" + i + " " + j);
                   return;
               }
           }
        }
    }

   // Two Pointer approach
    // O(nlogn);
    public static void TwoPointerApproach(int[]arr, int target){
        Arrays.sort(arr);
        int l =0;
        int r = arr.length-1;
        int sum ;
        while(l < r) {
           sum = arr[l]+arr[r];
           if(sum == target){
               System.out.println("Pair found" + l + " "+ r);
               return;
           }else if (sum > target){
               r--;
           }else {
               l++;
           }
        }


    }

    // HashmapApproach (O n) + O(n)
    public static void hashMapApproch(int[]arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : arr){
            if(map.containsKey(target-x)){
                System.out.println("Pair Found " + x + " " + (target-x));
                return;
            }
            map.put(x,1);
        }

    }
    public static void main(String[] args) {
        int[]arr= {1,2,3,6,4,9,8};
       // NestedLoop(arr,10);
        //TwoPointerApproach(arr, 7);
        hashMapApproch(arr,10);
    }
}
