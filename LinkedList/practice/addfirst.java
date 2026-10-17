package LinkedList.practice;

public class addfirst {
    public class Node{
int data;
Node next;

public Node(int data){
this.data=data;
this.next=null;
}
    }
public static  Node head;
public static  Node tail;

public void AddFirst(int data) {
    Node newNode=new Node(data);
  if(head==null){
        head=tail=newNode;
        return ;
    }
    newNode.next=head;


    }
public static void main(String[] args) {
    addfirst ll=new addfirst();
    ll.AddFirst(12);
}
}
