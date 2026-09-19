package functionsAndmethods;

import java.util.Scanner;

public class product {

    public static int multiply(int a,int b){
int c=a*b;
return c;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your first number :");
    int a=sc.nextInt();
    System.out.println("Enter your second number :");
int b=sc.nextInt();

int res=multiply(a, b);
System.out.println("Product of "+ a+" and "+b+" ="+" "+res);
};
    
};