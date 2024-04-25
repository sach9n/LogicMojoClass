package Week5;

public class Sorting {

    public static void swap(int[]arr,int a, int b){
        int temp = arr[b];
         arr[b] =  arr[a];
         arr[a] = temp;
    }

    public static void bubbleSort(int[]arr){
        int n=arr.length;
        boolean swaped = false;
        for(int i = 0; i < n;i++){
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    swaped = true;
                    swap(arr,j, j+1);
                }
            }

            if(!swaped)
                return;
        }
    }

   // Selection sort



    // merge sort
     public static void merge(int[]nums, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[]leftSubArrayu =  new int[n1];
        int[]rightSubarray =  new int[n2];
     }



    public static void splitAndmerge(int []nums, int l, int r){
        if(l<r){
            int  mid = l + (r-l)/2;
            splitAndmerge(nums,l,mid);
            splitAndmerge(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }


    public static void mergeSort(int[] nums){


        splitAndmerge(nums,0, nums.length-1);
    }
    public static void main(String[] args) {
        int[]num ={5,12,1,5,6,2};
        bubbleSort(num);

        for(int x: num){
            System.out.print(x + " ");
        }
    }
}
