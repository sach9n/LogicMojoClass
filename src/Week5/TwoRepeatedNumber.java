package Week5;

import java.util.Arrays;
import java.util.HashMap;

public class TwoRepeatedNumber {
    //Approach 1 (n^2)
   //nested loop
    public static void NestApproach(int[]arr){
        for(int i = 0; i< arr.length;i++){
            for(int j = i + 1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println("Are the Repeated Numbers");
    }

    //HashMap ApproachO(n) and O(n)space
    public static void HasMapApproach(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r: arr) {
            if (map.containsKey(r)) {
                map.get(r);
                System.out.print(r + " ");
                System.out.println();
            } else {
                map.put(r,1);
            }
        }
    }

    //Sorting Approach O(nlogn)
    public static void sortingApproach(int[]arr){
        Arrays.sort(arr);
        for(int i =0; i< arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i] + " ");
                System.out.println();
            }

            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
    }

    public static void arrayEleAsIndex(int[]nums ,int N){
        for(int  i= 0; i< nums.length;i++){
            int absValue = Math.abs(nums[i]);

            if(nums[absValue]<0)
                System.out.println("Repeated Number : " + absValue);
            else
                nums[absValue] = -nums[absValue];
        }

    }
    public static void main(String[] args) {
        int[]repeated ={0,1,2,1,2,3,4,5,6};
        int[]test= {1,3,4,2,2};
        NestApproach(test);
        HasMapApproach(repeated);
        sortingApproach(repeated);

        arrayEleAsIndex(repeated,9);
    }
}
