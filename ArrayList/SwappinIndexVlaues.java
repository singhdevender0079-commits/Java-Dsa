package ArrayList;
import java.util.ArrayList;
public class SwappinIndexVlaues {

public static void SwapList(ArrayList<Integer> list,int idx1,int idx2){
    int temp=list.get(idx1);
list.set(idx1,list.get(idx2));
list.set(idx2,temp);
}

    public static void main(String arg[]){
ArrayList<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
   System.out.println("Before swapping");
for(int  i=0;i<list.size();i++){
    System.out.print(list.get(i) +" ");
}
System.out.println("");
 System.out.println("After swapping");
 SwapList(list,0,5);
for(int  i=0;i<list.size();i++){
    System.out.print(list.get(i) +" ");
}

    }
}
