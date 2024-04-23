package Week4;

public class OccuringOddTimes {

    public static void getTheOddOne(int []arr){
        int xor = 0;
        for(int x : arr){
            xor = xor ^ x;
        }

        System.out.println(xor);
    }

    public static void main(String[] args) {
        int[]arr = {5,4,6,12,4,6,5};
        getTheOddOne(arr);
    }
}
