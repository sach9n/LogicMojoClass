package Week5;

public class Searching {

    // linear Searching or sequencial search from using for and while loop
    public static void linearSearch(int[]n, int target){
     //TC =  O(N) linear time
        // SC: O(1) constant space
        // Best for using unsorted array
        for(int x : n){
            if(x==target) {
                System.out.println(x);
                return;
            }
        }
        System.out.println("No number matches the target");
    }

    // Best Approach for sorted array (binary search)
    // find the get the value

    public static void binarySearch(int[]nums , int target){
        // if the array is Sorted Then get the idea of the binary search first
        // it might be solved by the binary search
        int l = 0; // left side or say 1st index
        int r = nums.length-1; // the last index from the array
        // TC=O(logN) as  we are dividing the arrays in two every step
        // SC = O(N)
        // finding the mid and geting the answer
        while(l <= r){
            // we get mid
            int mid = l + (r-l)/2;

            //if we get lucky
            if(nums[mid] == target) {
                System.out.println(mid); // getting the index of the array

                return;
            }else if(nums[mid] < target){
                l= mid+1;
            }else {
                r = mid-1;
            }
        };
    }

    public static void recursiveBinary(int[]nums , int l, int r , int target){
        if(r<l) return;
        int mid = (r+l)/2;
          if(nums[mid]==target){
              System.out.println(mid);
              return;
          }else if(nums[mid] < target){
              recursiveBinary(nums,mid+1, r,target);
          }else {
              recursiveBinary(nums,l, mid-1,target);
          }
    }
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid;
        int i = 1;
        while(l < r){
            mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                l++;
                i = mid+1;
            }else {
                r++;
                i = mid-1;
            }
        }

      return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,3};
       // linearSearch(nums, 5);
      //  binarySearch(nums,12);\
         System.out.println(searchInsert(nums,2));
       //recursiveBinary(nums, 0, nums.length-1, 6);
    }
}
