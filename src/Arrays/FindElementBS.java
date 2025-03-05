package Arrays;
import java.util.*;

public class FindElementBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int key = sc.nextInt();
        System.out.println(BSinArr(arr,key));
    }
    public static int BSinArr(int[] arr,int k){
        int idx =-1;
        int low = 0;
        int high = arr.length -1;

      while(high >=low){
          int mid = (low + high)/2;
          if(k>arr[mid]){
              low = mid+ 1;
          }else if(k < arr[mid]){
              high = mid - 1;
          }else {
              idx =mid;
              return idx;
          }
      }

        return idx;
    }
}
