package Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i <n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println( Arrays.toString(Reverse(arr,0,n-1)));
    }
    public static int[] Reverse(int[] arr,int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
