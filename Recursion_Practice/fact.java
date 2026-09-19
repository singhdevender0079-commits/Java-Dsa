package Recursion_Practice;
import java.util.*;
public class fact {
    public static int fa(int num){
if(num==0){
    return 1;
}
return num*fa(num-1);
    }
    public static void main(String arg[]){
        System.out.print("Enter a number for the factorial");
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
System.out.println(fa(num));
    }
}
