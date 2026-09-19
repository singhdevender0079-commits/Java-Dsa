package Rcursion;

public class incOrder {
    public static void incorder(int num) {
      if(num==1){
        System.out.println(num);
        return;
      }
incorder(num-1);
System.out.println(num);
    }
    public static void main(String[] args) {
        incorder(5);
    }
}
