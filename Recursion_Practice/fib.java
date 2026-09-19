package Recursion_Practice;
public class fib {
    public static int fi(int num) {
        if(num==0||num==1){
            return num;
        }
        int fab1=fi(num-2);
          int fab2=fi(num-1);
     int fabsum=fab1+fab2;
     return fabsum;
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(fi(num));
        }
}