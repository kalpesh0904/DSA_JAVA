package Arrays;
import java.util.*;
public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int span = arr[n-1]- arr[0];
        System.out.println(span);
    }
}
