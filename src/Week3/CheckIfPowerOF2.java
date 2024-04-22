package Week3;

public class CheckIfPowerOF2 {

    public static boolean isPower(int n){
        boolean value = ((n!=0) && (n & (n-1))==0);
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {
        isPower(64);
    }
}
