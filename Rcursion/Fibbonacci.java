package Rcursion;
public class Fibbonacci {
    public static int fib(int n) {
        if(n==0||n==1){
            return n;
        }
int fbm1=fib(n-1);
int fbm2=fib(n-2);
int  fibn=fbm1+fbm2;
return fibn;
    }
    public static void main(String arg[]){
        int n=50;
        System.out.println(fib(n));
    }
}
