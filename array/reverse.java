package array;
 class reverse {
    public static void reversearray(int arr[]){
int start=0;
int end=arr.length-1;
while(start<end){
    int temp =arr[start];
     arr[end]=temp;
     arr[start]=arr[end];
}
end--;
start++;
}
    public static void main(String arg[]){
int arr[]={1,2,3,4,6};
reversearray(arr);
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
System.out.println("jai perrnam di");
    }
};