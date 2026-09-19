package Recursion_Practice;

public class Decreasing {
    public static int dec(int num) {
        if(num==0){
            return 0;
        }
        System.out.println(num);
        return dec(num-1);
    }
    public static void main(String[] args) {
        int  num=5;
        
        System.out.println(dec(num));
    }
}
