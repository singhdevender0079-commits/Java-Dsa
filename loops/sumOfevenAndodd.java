package loops;
import java.util.*;
public class sumOfevenAndodd {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int evensum=0;
        int oddsum=0;
        System.out.println("enter how many values you want to separate the sum:"+" ");
        int value=sc.nextInt();
        System.out.println("enter the value:");
;   for (int n = 1; n <= value; n++) {
       int a=sc.nextInt();
       if(a%2==0){
evensum=evensum+a;
       }
       else{
        oddsum=oddsum+a;
       }
   } 
   System.out.println("sum off even value ="+" "+evensum);
     System.out.println("sum off odd value ="+" "+oddsum);
}
}