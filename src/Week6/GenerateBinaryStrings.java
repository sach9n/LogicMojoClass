package Week6;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStrings {
    // TC 2^N complexity; // Space O(N)
    public static void generateString(int n, String curr, List<String> res) {

          if(curr.length()==n){
              res.add(curr);
              return;
          }

         generateString(n,curr+"0",res);
         generateString(n, curr+"1",res);

        }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        int n =2;

        generateString(n, "", result);
        System.out.println(result);
    }
}