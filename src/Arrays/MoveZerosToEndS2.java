package Arrays;
import java.util.*;
public class MoveZerosToEndS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i < n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int j =-1;
        for(int i =0;i <n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int k=j+1 ; k < n ;k++){
            if(arr[k]!=0){
                int temp = arr[k];
                arr[k]=arr[j];
                arr[j]= temp;
                j++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
