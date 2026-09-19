package String;
import java.util.*;
public class subString {
    public static void sub(String str, int si,int ei) {
        String substrings=" ";
        for (int i = si; i <ei; i++) {
            substrings +=str.charAt(i);
        }
        System.out.println(substrings);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the starting index");
        int si=sc.nextInt();
         System.out.println("Enter the ending index");
        int ei=sc.nextInt();
        String str="HelloWorld";
        sub(str, si, ei);
    }
}
