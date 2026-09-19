package loops;

import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for table");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("please enter a valid number for the table :");
        } else {
            System.out.println("Table of " + "'" + n + "'" + " " + "=");
            int table = 1;
            for (int i = 1; i <= 10; i++) {
                table = n * i;
                System.out.println(table);
            }

        }

    }
}
