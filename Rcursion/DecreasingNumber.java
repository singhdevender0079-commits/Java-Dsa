package Rcursion;
import java.util.*;

public class DecreasingNumber {
    public static void  decorder(int n){
    if(n==1){
       System.out.println(n);
       return;
    }
    System.out.println(n);
    decorder(n-1);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        decorder(a);
    }
}
