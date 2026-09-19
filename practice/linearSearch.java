package practice;
class linearSearch{
    public static int linear(int arr[],int num) {
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]==num){
             return i;
           }
       }
return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int num=4;
        System.out.println(linear(arr, num));
    }
}