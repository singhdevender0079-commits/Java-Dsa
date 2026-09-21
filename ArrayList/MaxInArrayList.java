package ArrayList;
import java.util.ArrayList;
public class MaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(7);
int max=list.get(0);
for (int i = 1; i < list.size(); i++) {
    if(max<list.get(i)){
        max=list.get(i);
    }
}
System.out.println("max element : "+max);
    }
}
