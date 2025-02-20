package Functions;
import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        int f = getDigitFreq(n,digit);
        System.out.println(f);
    }
    public static int getDigitFreq(int n, int digit){
        int count = 0;
        while(n > 0){
            int d = n%10;
            n=n/10;
            if(d==digit){
                count++;
            }
        }


        return count;
    }
}
