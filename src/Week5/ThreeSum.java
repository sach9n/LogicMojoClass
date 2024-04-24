package Week5;

import java.util.Arrays;

public class ThreeSum {

    // Approach 1 using Nested For lops
    public static void NestApproach(int[]arr, int target){
        for(int i =0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1; k< arr.length ; k++){
                    if(arr[i]+arr[j]+arr[k]== target){
                        System.out.println("Three Pair found and " + arr[i] + " " + arr[j] + " " + arr[k]);
                        return;
                    }
                }
            }
        }
    }

    public static void  NSquareApproach(int[]arr,int N ,int target){
        int num = 0;
        int sum = 0;
        Arrays.sort(arr);
        for(int i =0;i<N;i++){
            num = target-arr[i];

            for(int j= i+1;j< N-2;j++){
               sum =  arr[i]+arr[j];
                if(sum==num){
                    System.out.println("The Three Pair is found at :" +arr[i] + " " + arr[j] + " "+ num);
                   return;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[]arr = {4,1,2,5,3};
         int N  = arr.length;
       // NestApproach(arr,18);
        NSquareApproach(arr,N,9);
    }
}
