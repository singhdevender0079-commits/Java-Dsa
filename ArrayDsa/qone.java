package ArrayDsa;

public class qone {
    public static boolean sameElemnt(int arr[] ) {
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(num==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5};
        int arr[]={1,2,5,5,4,6};
        System.out.println(sameElemnt(arr));
    }
}
