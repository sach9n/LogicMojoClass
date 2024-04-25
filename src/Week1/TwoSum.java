package Week1;

public class TwoSum {

    public  static  void printNos(int N) {
            //Your code here
       if(N <=0) return;
        printNos(N-1);
        System.out.println(N);
    }

    public static void main(String[] args) {
        printNos(10);
    }
}
