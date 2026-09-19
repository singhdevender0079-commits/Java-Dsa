package array;

public class maxSubArraySum {
    public static void sumSubArray(int arr[]) {
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
            int start = i;
            for (int j = i; j < arr.length; j++) {
               int end=j;
               int currSum=0;
               for (int k = start; k < end; k++) {
         currSum +=arr[k];
               }
               System.out.println(currSum);
        if(currSum>maxSum){
            maxSum=currSum;
        }
            }
        }
        System.out.println(maxSum);
    }
    

    public static void main(String[] args) {
        int arr[]={2,4,9,8,10};
        sumSubArray(arr);
    }
}
