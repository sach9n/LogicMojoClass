package Week6;

import java.util.Arrays;

public class KnightTour {
    // Knight tour possible place Knight to be placed
    static int[] rowInc = {-2,-2,2,2,-1,1,-1,1};
    static int[] colInc = {-1,1,-1,1,-2,-2,2,2};


    public static boolean isSafe(int row , int col,int[][]matrix,int n){
        if((row >= 0) && (row < n) && (col >= 0) && (col < n) && (matrix[row][col] == -1))
             return true;
        return false;
    }


   public static boolean transferKnight(int row ,int col, int n , int move, int[][]matx ){
       if (move == n * n) {
           return true;
       }

       for (int i = 0; i < rowInc.length; i++) {
           int nextRow = row + rowInc[i];
           int nextCol = col + colInc[i];

           if (isSafe(nextRow, nextCol, matx, n)) {
               matx[nextRow][nextCol] = move;
               if (transferKnight(nextRow, nextCol, n, move + 1, matx)) {
                   return true;
               } else {
                   matx[nextRow][nextCol] = -1; // Corrected this line
               }
           }
       }
       return false;
   }


    public static void main(String[] args) {
        int n =5;
        int[][]matx = new int[n][n];

         for(int[]m : matx){
             Arrays.fill(m,-1);
         }

         matx[0][0] = 0;

         boolean isPossible = transferKnight(0,0,n ,1,matx);

         if(isPossible){
             for(int[]m:matx){
                 for(int x: m ){
                     System.out.print(x + " ");
                 }
                 System.out.println();
             }
         }else {
             System.out.println("No Possible solution avaliable");
         }
    }
}
