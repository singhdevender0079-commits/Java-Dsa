package BasicSorting;
import java.util.*;
public class inbuiltsort {

public static void AssendingOrder(Integer arr[] ) {
     Arrays.sort(arr);
        for(int i= 0; i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
}

public static void DescendingOrder(Integer arr[] ) {
      Arrays.sort(arr,Collections.reverseOrder());
      for(int i= 0; i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        Integer arr[]=new Integer[a];
        System.out.println("Enter the data");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
}
   System.out.println("for Asending sorting enter: 1 \n for descending sorting enter:2");
int num=sc.nextInt();
if(num==1){
AssendingOrder(arr);
}
 else if(num==2){
    DescendingOrder(arr);
}
else{
    System.out.println("please enter the valid number");
}

    }
    }