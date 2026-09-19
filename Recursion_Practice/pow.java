package Recursion_Practice;

public class pow {
    public static int po(int num,int pow) {
        if(pow==0){
            return 1;
        }
return num*po(num, pow-1);
    }
    public static void main(String[] args) {
        int num=2;
int pow=5;
System.out.println(po(num, pow));
    }
}
