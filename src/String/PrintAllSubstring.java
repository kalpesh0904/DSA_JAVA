package String;
import java.util.*;
public class PrintAllSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();

        int n = s.length();
        int cnt =0;
        for(int i =0; i <=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(s.substring(i,j));
                cnt++;
            }
        }
        System.out.println("Total number of substrings of length " + n + " are " + cnt);
    }
}
