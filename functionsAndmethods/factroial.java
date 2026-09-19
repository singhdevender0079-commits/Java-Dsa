package functionsAndmethods;

import java.util.Scanner;

public class factroial {

public static int fac(int a) {
    int f=1;
    for (int i = a; i > 0; i--) {
        f=f*i;
    }
    return f;
};
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value for factorial :");
        int a=sc.nextInt();
        System.out.println("Factorial of "+a+" = "+fac(a));
    }
}
