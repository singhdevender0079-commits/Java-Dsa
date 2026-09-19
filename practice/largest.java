package practice;
public class largest {
    public static void largestArray(int arr[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={4,5,7,6,4,5,4,8,2};
        largestArray(arr);
    }
}
