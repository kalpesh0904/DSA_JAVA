package String;
import java.util.*;
public class PrintAllPalindromicSubstring {
    public static boolean  IsPalin(String s){
        int i =0;
        int j = s.length()-1;
        while(i <=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1!=ch2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();

        int n = str.length();

        for(int i =0; i <n;i++){
            for(int j=i+1;j<=n;j++){
                String ss = str.substring(i,j);
                if(IsPalin(ss)){
                    System.out.println(ss);
                }

            }
        }
    }
}
