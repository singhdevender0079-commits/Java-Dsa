package practice;

class reverse{
    public static void reversing(int arr[] ) {
        int start=0;
       int  end=arr.length-1;
while(start<=end){
    int temp=arr[start];
   arr[end]=temp;
arr[start]=arr[end];
}
end--;
start++;
    }
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5,6};
      reversing(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}