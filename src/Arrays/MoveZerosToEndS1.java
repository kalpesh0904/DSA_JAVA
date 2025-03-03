package Arrays;
import java.util.*;
public class MoveZerosToEndS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0; i < n ; i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }

        int x = temp.size();
        for(int i =0 ; i < x; i++){
            arr[i]=temp.get(i);
        }
        for(int i=x;i <n;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
