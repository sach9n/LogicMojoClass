package Week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    // for n/3 majority element;
    public static void CheckforNby3(int []arr){
        int maj = arr[0];
        int count = 1;

        for(int x: arr){
            if(x==maj){
                count++;
            }else {
                count--;
            }

            if(count < 0){
                maj = x;
                count = 1;
            }
        }

        count = 0;
        for(int x : arr){
            if(maj==x){
                count++;
            }
        }

        System.out.println(maj);
    }

    // Hash Map approch
    public static List<Integer> Majority2(int[]arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer>  result = new ArrayList<>();
        int thershold  = arr.length/3;

        for(int x: arr){
          map.put(x, map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > thershold){
                result.add(entry.getKey());
            }
        }
       return result;
    }
    public static void main(String[] args) {

        int[] nums = {1};
      List<Integer> maj = Majority2(nums);
        System.out.println(maj);
    }
}
