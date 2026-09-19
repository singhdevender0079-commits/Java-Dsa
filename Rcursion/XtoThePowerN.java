package Rcursion;

public class XtoThePowerN {
    public static int power(int x,int pow){
        if(pow==0){
            return 1;
        }
        
        return x*power(x,pow-1);
    }
    public static void main(String arg[]){
int x=2;
int pow=5;
System.out.print(power(x,pow));
    }
}
