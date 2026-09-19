package loops;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for factorial :");
        int n=sc.nextInt();
        int fac=1;
        for (int i = n; i >0; i--) {
            fac=fac*i;
        }
        System.out.println("factorial of" + " " + n + " "+ "is ="+" "+fac);
    }
}
