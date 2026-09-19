package Rcursion;
import java.util.*;
public class Tilling {
    public static int tile(int n) {
        if(n==0||n==1){
            return  1;
        }
        //! for horizontal
int hori=tile(n-1);
//! for verticle
int verti=tile(n-2);

return hori+verti;

    }
    public static void main(String arg[]){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
System.out.print(tile(n));
    }

}
