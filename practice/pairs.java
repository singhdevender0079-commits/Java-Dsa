package practice;
import java.util.*;
class pairs{
    public static void paring(int arr[] ) {
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
        for (int j =i+1; j < arr.length; j++) {
            System.out.println("("+curr+","+arr[j]+")");
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.print("enter the data");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        paring(arr);
        System.out.println("Jai peeran di");
    }
}