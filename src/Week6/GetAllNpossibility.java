package Week6;

public class GetAllNpossibility {

    public static void printAll(int arr[],int i, int N){
      // Soluion
      if(i==N){
          for(int j = 0; j<N;j++){
              System.out.println(arr[j]+" ");
          }
          System.out.println();
          return;
      }

      // step2
//        arr[i] = 1;
//      printAll(arr,i+1,N);
//      arr[i] = 2;
//      printAll(arr,i+1,N);
//      arr[i]= 3;
//      printAll(arr,i+1,N);

      // We will use a loop for this
        //choice
        for(int k = 0; k <= N; k++){
            arr[i] = k;
            printAll(arr, i+1, N);
        }
      return;

    }

    public static void main(String[] args) {
        int N = 3;
        int []arr = new int[N];

        for(int i = 0; i <N;i++){
            arr[i]=0;
        }

        printAll(arr,0,N);
    }
}
