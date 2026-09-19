package array;

public class miner {

    public static int smallest(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(smallest(arr));
    }
}
