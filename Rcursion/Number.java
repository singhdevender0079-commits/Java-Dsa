package Rcursion;

public class Number {
    public static void number(String arr[],int n ) {
         if(n==0){
            return;
        }
        int lastdigit=n%10;
       number(arr,lastdigit/10);
         
System.out.print(arr[lastdigit]+" "); 
    }
    public static void main(String[] args) {
         String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int n=1998;
        number(arr, n);
       
    }
}
