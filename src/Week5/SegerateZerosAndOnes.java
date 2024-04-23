package Week5;

import java.util.Arrays;

public class SegerateZerosAndOnes {
    // approach 1 = sortMethod(nlogN)

    // TwoPointer

    public static int[] swap(int []arr,int i,int j){
        int c = arr[j];
        arr[j] = arr[i];
        arr[i] = c;
        return arr;
    }
    public static void TwoPointer(int[]arr){
        int l = 0;
        int r = arr.length-1;

        while(l < r){
          while(l<r && arr[l]==0) l++;
          while(l<r && arr[r]==1) r--;

          if(l<r){
              swap(arr,l,r);
              l++;
              r--;
          }
        }

       for(int x: arr){
           System.out.print(x);
       }
    }

    public static void main(String[] args) {
        int[]arr = {0,1,0,1,0,1};
        TwoPointer(arr);

    }
}
