package Rcursion;

public class LastOccurence {
    public static int Last(int arr[], int n, int i) {
        if(i>arr.length-1){
            return 0;
        }
        if(arr[i]==n){
System.out.println(i);
        }
return Last(arr, n,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,2,7};
        int n=2;
        int i=0;
      Last(arr, n, i);
    }
}
