package String;
import java.util.*;
public class anagrams {

    public static void anagramsString(String str1, String str2) {
  str1=str1.toLowerCase();
  str2=str2.toLowerCase();

if(str1.length()==str2.length()){
    char[] str1chararray=str1.toCharArray();
    char[] str2chararray=str2.toCharArray();

    Arrays.sort(str1chararray);
    Arrays.sort(str2chararray);
boolean result=Arrays.equals(str2chararray, str2chararray);
if(result){
    System.out.println(" Yes "+str1+ " and "+str2+" are the anagrams strings " );
}

else{
    System.out.println("Not anangrams strings");
}
}
else{
    System.out.println("These string could not be paragrams because of the size");
}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter any String to compare");
        str1 = sc.nextLine();
        System.out.println("enter the second string");
        str2 = sc.nextLine();
        anagramsString(str1, str2);
    }
}
