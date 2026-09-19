package array;

public class passing_array_argument {

public static void  argu( int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        arr[i]=arr[i]+1;
    }
}
    public static void main(String[] args) {
        int arr[]={99,99,99};
argu(arr);
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
    }
}
