package Two_D_Array;
import java.util.*;
 class creation {
    public static boolean maxIndex(int arr[][],int num){
       
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
        if(num==arr[i][j]){
        int dex=arr[i][j];
System.out.print(i+"+"+j);
return true;
        }
    
    }
}
return false;
    }
   
    public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];
  int n=arr.length;
    int m=arr[0].length;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        arr[i][j]=sc.nextInt();
    }
}

for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j]);
    }
    System.out.println(" ");
}
int num=sc.nextInt();
maxIndex(arr,num);
    }
}
