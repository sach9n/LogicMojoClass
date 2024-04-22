package Week3;

public class GetSetClearBits {

    public static void getBit(int n, int i){
        int ans = (n & 1<<i)!= 0 ? 1 : 0;
        System.out.println(ans);
    }

    public static void setBit(int n , int i){
        int ans =  (n|1<<i);
        System.out.println(ans);
    }

    public static void clearBit(int n , int i){
        int ans = (n & ~(1<<i));
        System.out.println(ans);
    }

    public static void main(String[] args) {
        getBit(10,2);
        setBit(10,2);
        clearBit(10,1);
    }
}
