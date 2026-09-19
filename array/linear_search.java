package array;

public class linear_search {
    public static int search(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int arr[]={12,36,45,10,2,85};
        int num=10;
    System.out.print(search(arr,num));
    }
}
