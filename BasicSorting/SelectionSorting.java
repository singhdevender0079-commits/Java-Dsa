package BasicSorting;

public class SelectionSorting {
    public static void selectionSorting(int arr[] ) {
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(min<arr[j]){
                    min=arr[j];
                }
            }
            //! swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int arr[] ) {
        for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        selectionSorting(arr);
        print(arr);
    }
}
