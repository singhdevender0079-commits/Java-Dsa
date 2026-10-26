package LinkedList;

public class ReverseLinkedList {
    public class Node{
int data;
Node next;
public  Node(int data){
this.data=data;
this.next=null;
}
    }
public  static Node head;
public static Node tail;

public void add(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return ;
    }
newNode.next=head;
head=newNode;
}

public void  reverse(){
    Node prev=null;
    Node curr=head=tail;
    Node next;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
}
public static void main(String[] args) {
 ReverseLinkedList ll=new ReverseLinkedList();
 ll.add(3);
 ll.add(2);
 ll.add(1);
ll.reverse();
}
}
