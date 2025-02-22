package Functions;
import java.util.*;
public class DecimalToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        int ans = getValueInBase(n,base);
        System.out.println(ans);

    }
    public static int getValueInBase(int n , int b){

        int  rv = 0;
        int p = 1;
        while(n>0){
            int dig= n%b;
            n=n/b;
            rv+=dig*p;
            p=p*10;
        }
        return rv;
    }
}
