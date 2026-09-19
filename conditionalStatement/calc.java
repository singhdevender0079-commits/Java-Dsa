import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
              int a=sc.nextInt();
System.out.println("Enter a operater");
         char operater = sc.next().charAt(0);
        System.out.println("Enter second number");
        int b=sc.nextInt();
switch(operater) {
    case '+' :
        System.out.println(a+b);
        break; 

          case '-' :
        System.out.println(a-b);
        break;

   case '*' :
        System.out.println(a*b);
        break;

   case '/' :
        System.out.println(a/b);
        break;
    default:
      System.out.println("Please enter a valid number");
}


    }
}
