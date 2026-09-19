

import java.util.Scanner;

public class largestFrom3 {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 1 no.=");
        int a = sc.nextInt();
        System.out.println("enter your 2 no.=");
        int b = sc.nextInt();
        System.out.println("enter your 3 no.=");
        int c = sc.nextInt();

        if (a > b  && a > c) {
            System.out.println("a is grater");
        }

        else if (b > c) {
            System.out.println("b is grater");
        } else {
            System.out.println(" c is grater");
        }
    }
}
