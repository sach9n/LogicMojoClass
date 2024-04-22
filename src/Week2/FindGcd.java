package Week2;

public class FindGcd {

    // approach 1 O(n) time Complexity

    public static void findGcd(int a, int b){
        int minValue = Math.min(a,b); // get  min Value
        while(minValue > 0){
            if(a % minValue == 0 && b%minValue ==0){
                System.out.println("The Gcd of : "+ a + " & " + b + " =  " + minValue );
                return;
            }
         minValue--;
        }

        System.out.println("The Gcd is not found the number is less than 1");
    }

    // Aprocach 2 Ecledian approach with recursion O(log(n)) + SC O(n) due to recursion

    public static int GcdRecursionApproach(int a , int b){
          if(b == 0){
              return a;
          }
          return GcdRecursionApproach(b ,  a%b );
    }

    // Without Space

    public static void EcledianApproach(int a , int b){
        int gcd = 0;

        if(a<b) {
            gcd = GcdRecursionApproach(b,a);
        }else {
            gcd = GcdRecursionApproach(a,b);
        }

        System.out.println("GCD Found :" + gcd);

    }
    // get the lcm by formula
    public static int Lcm(int a , int b){
       // Tc O(1) SC = O(n)
        int i = (a * b) /GcdRecursionApproach(a, b);
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        findGcd(36,60);

        System.out.println(GcdRecursionApproach(36,60));
        EcledianApproach(3,6);
        Lcm(36,60);
    }
}
