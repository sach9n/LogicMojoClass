package Week4;

import java.util.Arrays;

public class SearchInSortedArray {

    public static int findthePivot(int []arr){
        int l= 0;
        int r = arr.length-1;
        int mid = 0;
        while(l <= r){
            mid = l + (r-l)/2;
            if(arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] > arr[r-1]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }


    public static void binarySearch(int[]arr, int l, int r, int target){
        int mid = 0;
        while(l <= r){
            mid = l + (r-l)/2;
            if(arr[mid]==target){
                System.out.println("Element Found at : " + arr[mid]);
                return;
            }else if(arr[mid]> target) {
                r = mid - 1;
            }else {
                l = mid +1;
            }
        }

    }



   public static  void SearchInRotatedArray(int[]arr,int target){
        if(arr[0]<= arr[arr.length-1]){
            binarySearch(arr,0,arr.length-1,target);
        }

        int pivotIndex = findthePivot(arr);
        if(target >= arr[0]){
            binarySearch(arr,0,pivotIndex,target);
        }else {
            binarySearch(arr,pivotIndex, arr.length-1,target);
        }


    }

    public static void main(String[] args) {
        int[]num = {1,2,3,1};
        SearchInRotatedArray(num,4);
    }

}
