package Week5;

public class SubArraySum {
    //Two pointer approach
    public static void twoPointer(int[]arr,int target){
        int n = arr.length;
        int sum = 0;
        int l = 0;
        int r = 0;

        while (r < n) {
            sum += arr[r];
            while (sum > target && l <= r) {
                sum -= arr[l];
                l++;
            }
            if (sum == target) {
                System.out.println("The sum is found at: L:" + l + " R:" + r);
                return;
            }
            r++;
        }
        System.out.println("No Possible Solution Exists");
    }


    public static void main(String[] args) {
        int[]arr = {1,3,4,5,6,7};
        twoPointer(arr,4);

    }
}
