package Recursion_Practice;

public class firstoc {
    public static int occurance(int arr[],int num,int i) {
        if(arr[i]==num){
            return  i;
        }
        return occurance(arr, num, i+1);
    }
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8};
    int i=0;
    int num=3;
        System.out.println(occurance(arr, num, i));
    }
}
