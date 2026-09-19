package practice;

public class BubbleSorting {
    public static void bublesort(int arr[]){
        for(int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void print(int arr[] ) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print(arr);
    }
    public static void main(String arg[]){
int arr[]={5,2,3,4,1};
bublesort(arr);
print(arr);
    }
}
