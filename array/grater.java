package array;

public class grater {
    public static int greatest(int arr[]) {
    int great=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(great<arr[i]){
great=arr[i];
        }
    }
    return great;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
    System.out.println(greatest(arr));

    }
}
