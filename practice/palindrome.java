package practice;
import java.util.*;
class  palindrome{
    public static boolean  palindromeString(String str){
        int n=str.length();
for (int i = 0; i < str.length()/2; i++) {
    if(str.charAt(i)==str.charAt(n-i-1)){
return  true;
    }
    else{
return  false;
    }
}
return false;
    }
    public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
String str;
str=sc.nextLine();
System.out.println(palindromeString(str));
    }
}