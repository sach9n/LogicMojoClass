package Week4;

public class ClosestToZero {

    public static void ClosestToZero(int[]arr){
        int currSum =0;
        int closestSum = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
               currSum = arr[i]+ arr[j];
            }


        }
    }
}
