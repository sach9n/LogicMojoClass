package Week6;

import java.util.Arrays;

public class NQueen {
    // Get all the valid solution for n queen
    // pre = int[][]matrix , int n , int rol

    //T:C O(n!)
   public static boolean isSafe(int row,int col, char [][]matrix, int n){

       // Upper col
       int tempRow , tempCol;
       tempCol = col;
       while(tempCol >=n){
           if(matrix[row][tempCol]=='Q'){
               return false;
           }
           tempCol--;
       }

      // updateing the uperdiagonal
       tempCol = col ;tempRow = row;
       while(tempCol>=0&& tempRow>=0){
           if(matrix[tempRow][tempCol]=='Q'){
               return false;
           }
           tempCol++; tempRow++;
       }

       tempCol = col; tempRow = row;
       while(tempCol>=0 && tempRow<n){
           if(matrix[tempRow][tempCol]=='Q'){
               return false;
           }
           tempCol--; tempRow++;
       }

       return false;
   }


    public static void queensNpositions(char[][]queen,int n, int col){
       if(col==n){
           System.out.println(Arrays.deepToString(queen));
          return;
       }

       for(int row = 0; row < n; row++){

           if(isSafe(row,col,queen,n)){
               queen[row][col]='Q';
               queensNpositions(queen,n,col+1);
               queen[row][col]='.';
           }

       }

    }



    public static void main(String[] args) {
        int N = 4;

        char[][]Nqueen = new char[N][N];
       for(char []m: Nqueen){
           Arrays.fill(m,'.');
       }

      queensNpositions(Nqueen,N,1);
    }
}
