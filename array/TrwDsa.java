package array;

public class TrwDsa {
    public static void dsaTrapping(int height[] ) {
        int n=height.length;
      int leftMax[]=new int[n];
      leftMax[0]=height[0];
      for(int i=1;i<n;i++){
        leftMax[i]=Math.max(height[i], leftMax[i-1]);
      }

    int rightMax[]=new int[n];
      rightMax[n - 1] = height[n - 1];
    for (int i = n-2; i >= 0; i--) {
        rightMax[i]=Math.max(height[i], rightMax[i+1]);
    }
    int min[]=new int[n];
    for (int i = 0; i <n; i++) {
       min[i]=Math.min(leftMax[i], rightMax[i]);
        if(leftMax[i]==rightMax[i]){
min[i]=leftMax[i];
        }
    }
int volume=0;
for (int i = 0; i < n; i++) {
    int diffrance=min[i]-height[i];
    volume +=diffrance;
}
System.out.println(volume);
    }
    public static void main(String arg[]){
int height[]={4,2,0,6,3,2,5};
dsaTrapping(height);
    }

  }
