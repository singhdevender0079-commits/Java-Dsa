package array;

 class TrappingRainWater {
    public static void TrainW(int arr[]) {
        int MaxArrLeft[]={4,4,4,6,6,6,6};
        int MaxArrRight[]={6,6,6,6,5,5,5};
        // int arr[]={4,2,0,6,3,2,5};
        int MinArr[]=new int[MaxArrRight.length];
        for (int i = 0; i < MaxArrLeft.length; i++) {
//             if(MaxArrRight[i] < MaxArrLeft[i]){ 
// MinArr[i]=MaxArrRight[i];
//             }
//             else if(MaxArrRight[i] > MaxArrLeft[i]){--
//                 MinArr[i]=MaxArrLeft[i];
//             }
MinArr[i]=Math.min(MaxArrLeft[i], MaxArrRight[i]);
            if(MaxArrRight[i] == MaxArrLeft[i]){
                MinArr[i]=MaxArrLeft[i];
            }
        }
        int volume=0;
        for(int i=0; i<arr.length;i++){
            int diffrance=MinArr[i]-arr[i];
            volume +=diffrance;
        }
        System.out.print(volume);
    }

    
    public static void main(String arg[]){
int arr[]={4,2,0,6,3,2,5};
TrainW(arr);
    }

 }