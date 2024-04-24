package Week4;

public class SearchInSortedArray {

    public static int findthePivot(int []arr){
        int l= 0;
        int r = arr.length-1;
        int mid = 0;
        while(l <= r){
            mid = l + (r-l)/2;
            if(arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] > arr[l]){
                l = mid+1;
            }else{
                r = mid -1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[]arr,int target,int l,int r){
        
    }

   public static  void SearchInRotatedArray(int[]arr,int target){
       int pivotIndex = findthePivot(arr);

       if(target>=arr[0]){

       }
   }

    public static void main(String[] args) {
        int[]num = {1,2,3,1};
        System.out.println(findthePivot(num));
    }

}
