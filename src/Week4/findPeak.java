package Week4;

public class findPeak {

    public static void PeakPoint(int[]arr){
        for(int i=1;i<= arr.length-1;i++){
          if(arr[i] > arr[i+1] && arr[i]> arr[i-1]){
              System.out.println(arr[i]);
              return;
          }
        }
    }

    public static  int findPeakElement(int[] arr) {

        int l = 0;
        int r= arr.length-1;
        int mid;

        while(l<= r){
            mid= l +(r-l)/2;
            if(r < 2 || l==r){
               int max =  Math.max(arr[l],arr[r]);
                return max;
            }
//            if()
                if(arr[mid] > arr[mid+1] && arr[mid]>arr[mid-1]){
                    return mid;
                }else if(arr[mid] < arr[l]){
                    l = mid+1;
                }else {
                    r = mid-1;
                }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[]peak = {2,1};
//        PeakPoint(peak);
        System.out.println(findPeakElement(peak));
    }
}

