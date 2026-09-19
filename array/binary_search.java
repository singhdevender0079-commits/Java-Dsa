package array;

public class binary_search {
    public static int binarySearch(int arr[],int num) {
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==num){
return mid;
            }
            if(arr[mid] < num){
start= mid+1;
            }
            else{
                mid= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,6};
        int num =1;
        System.out.print(binarySearch(arr,num));
    }
}