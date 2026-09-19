package Rcursion;

public class fabonaci {
    public static int fab(int n) {
        if(n==-1){
            return 0;
        }
       return n+fab(n-1);
        
    }
    public static void main(String[] args) {
System.out.println(fab(5)); 
}
}
