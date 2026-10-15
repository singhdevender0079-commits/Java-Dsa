package LinkedList;
public class AddFirst {
    public static class NODE{
        int data; 
        NODE next;
public  NODE(int data){
    this.data=data;
    this.next=null;
}
    }
public static NODE head;
public static NODE tail;

public void addFirst(int data){
    NODE newNode=new NODE(data);
    if(head==null){
        head=tail=newNode;
        return ;
    }
newNode.next=head;
}
    public static void main(String[] args) {
        AddFirst ll=new AddFirst();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
