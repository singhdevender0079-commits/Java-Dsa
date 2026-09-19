package Recursion_Practice;

public class Sum {
    public static int sum(int num) {
        if(num==0){
            return 0;
        }
        return num+sum(num-1);
    }
    public static void main(String arg[]){
int num=5;
System.out.println(sum(num));
}
}
