package Functions;
import java.util.*;
public class AnyToBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        int ans =getDecVal(n,base);
        System.out.println(ans);
    }
    public static int getDecVal(int n ,int base){
        int b= 10;
        int rv =0;
        int p = 1;
        while(n>0){
            int dig= n%b;
            n=n/b;
            rv+=dig*p;
            p=p*base;
        }

        return rv;
    }
}
