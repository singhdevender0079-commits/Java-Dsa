package practice;

public class grater {
    public static void great( int arr[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,9,4,5,10};
        great(arr);
    }
}
