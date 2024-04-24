package Week4;

public class BiotnicPoint {
   public static int BitonicPoint(int[]arr){
       int l = 0;
       int r = arr.length-1;

       while(l <=r){
           int mid = l + (r-l)/2;
           if(l==r){
               return arr[l];
           }else if(l==r-1){
               return Math.max(arr[l],arr[r]);
           }

           if(arr[mid]> arr[mid-1]&& arr[mid]>arr[mid+1]){
               return arr[mid];
           } else if (arr[mid] > arr[mid-1]) {
               l = mid+1;
           }else {
               r = mid-1;
           }
       }

       return -1;
   }


    public static void main(String[] args) {
        int[]arr = {7,8,9,12,8,4,2};
        System.out.println(BitonicPoint(arr));

    }
}
