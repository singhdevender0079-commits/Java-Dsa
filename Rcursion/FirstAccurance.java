package Rcursion;

public class FirstAccurance {
    public static int first(int arr[], int n ,int i){
         if(arr[i]==n){
return i;
         }
         return first(arr,n,i+1);
    }
    public static void main(String arg[]){
int arr[]={1,2,3,4,5,6};
int n=5;
System.out.print(first(arr,n,0));
    }
}
