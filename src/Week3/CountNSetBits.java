package Week3;

public class CountNSetBits {

    public static void checkSetBitForN(int  n){
       int count = 0;
        while(n > 0){
            if((n & 1)!=0) count++;
            n>>=1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        checkSetBitForN(10);
    }
}
