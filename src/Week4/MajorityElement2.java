package Week4;

public class MajorityElement2 {
    // for n/3 majority element;
    public static void CheckforNby3(int []arr){
        int maj = arr[0];
        int count = 1;

        for(int x: arr){
            if(x==maj){
                count++;
            }else {
                count--;
            }

            if(count < 0){
                maj = x;
                count = 1;
            }
        }

        count = 0;
        for(int x : arr){
            if(maj==x){
                count++;
            }
        }

        System.out.println(maj);
    }

    public static void main(String[] args) {
        int[]nums = {1,2,2,3,2,2,3,3,3};
        CheckforNby3(nums);
    }
}
