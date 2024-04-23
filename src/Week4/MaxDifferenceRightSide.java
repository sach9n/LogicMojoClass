package Week4;

public class MaxDifferenceRightSide {

    // Get the Max difference of the arr with the index higher number at higher index and lower number at lower index
    public static void GetDiff(int[]arr){
        int max = 0;
        for(int i= 0;i< arr.length;i++){
           for(int j = i+1; j < arr.length;j++){
               max = Math.max(max, arr[j]-arr[i]);
           }
       }
        System.out.println(max);
    }

    public static void OptimizedApproach(int[]arr){

        int minValue = arr[0];int maxDiff = 0;

        for( int i = 1; i< arr.length;i++){
             maxDiff = Math.max(maxDiff,arr[i]-minValue);

             minValue = Math.min(minValue,arr[i]);
        }

        System.out.println(maxDiff);
    }

    public static void main(String[] args) {
        int[]arr= {3,1,2,5,6,7,100,10};
        // GetDiff(arr);
        OptimizedApproach(arr);
    }
}
