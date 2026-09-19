
class bruteForce {
    public static void bruteForces(int arr[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j <arr.length; j++) {
                int end=j;
                int currsum=0;
                for (int k = start; k <= end; k++) {
                    currsum +=arr[k];
                }
                System.out.println(currsum);
                if(max<currsum){
                    max=currsum;
                }
            }
        }
        System.out.println("Max sum in the subbarraym = "+max);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        bruteForces(arr);
        
    }
}
