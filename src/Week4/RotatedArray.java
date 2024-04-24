package Week4;

public class RotatedArray {


    public static void bruteForce(int[]arr, int d){
        if(d==0){
            return;
        }

        int n = arr.length;
        d = d % n;
        reversetheArray(arr, 0,d-1);
        reversetheArray(arr,d,n-1);
        reversetheArray(arr,0,n-1);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void reversetheArray(int[]arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    };

    public static void main(String[] args) {
        int[]arr = {4,7,2,1,9,10,12};
        int d = 2;
        bruteForce(arr,d);
        System.out.println();
    }
}
