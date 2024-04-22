package Week2;

public class FibonacchiNumber {

    public static void  getNthFibanacchi(int n){
        // seed numbers
        int a = 0;
        int b = 1;
        // 0 ,1 ,1,2,3,5,
        while(n > 0){
            int temp = a + b;
            a = b;
            b = temp;
            System.out.println(b);
            n--;
        }
    }

    // Using for loop

    public static void fibonacchi(int n ){
        int first= 0 ,second = 1;
        // Can be Printend with out using the third variable temp
        for(int i = 2; i <= n; i++ ){
             first =  first + second; // temp = a + b ; b = a ; a = temp;
             second = first - second;
             System.out.println(second);
        }
    }


    public static void main(String[] args) {

        fibonacchi(10);
        //getNthFibanacchi(10);
    }

}
