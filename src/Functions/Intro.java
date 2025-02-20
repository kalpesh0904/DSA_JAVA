package Functions;
//Find nPr
// fn 1. factorial
//fn 2. display
import java.util.*;
public class Intro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = Fact(n);
        int nmrfact = Fact(n-r);
        int nPr = nfact/nmrfact;
        display(n,r,nPr);
    }
    public static int Fact(int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void display(int n,int r,int nPr){
        System.out.println( n + "P"+ r +" is "+nPr);
    }
}
