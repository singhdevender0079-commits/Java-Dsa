package Recursion_Practice;

public class Increasing {
    public static void inc(int num) {
        if(num==0){
return;
        }
        inc(num-1);
    System.out.println(num);
    }
    public static void main(String[] args) {
        int num=5;
        inc(num);
    } 
}
