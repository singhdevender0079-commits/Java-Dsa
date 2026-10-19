package LinkedList.practice;

import OOPS.practice;

public class Practice {
    public class  Node {
   int data;
   Node next;
   public  Node(int data){
this.data=data;
this.next=null;
   } 
    }
    public static  Node head;
public  static Node tail;
public  static  int size;
//! To add int the starting of the node 
public  void addFirst(int data){
    Node newNode=new Node(data); 
size++;
if(head==null){
head=tail=newNode;
return;
}
newNode.next=head;
head=newNode;
}

public void addLast(int data){
    Node newNode =new Node(data);
    size++;
    if (head==null) {
        head=tail=newNode;
        return ;
    }
tail.next=newNode;
tail=newNode;
}

//! To remove from the starting
public int ReStart(){
    if (size==0) {
        System.out.println("LikedList is empty");
    return  Integer.MIN_VALUE;
    }
    else if (size==1) {
        int val=head.data;
        head=tail=null;
        size =0;
        return  val;
    }
    int val=head.data;
head=head.next;
size--;
return val;
}

//! To remove from the end
public int ReEnd(){
    if (size==0) {
        System.out.println("LikedList is empty");
    return  Integer.MIN_VALUE;
    }
    else if (size==1) {
        int val=head.data;
        head=tail=null;
        size =0;
        return  val;
    }
   Node prev= head;
   for(int i=0; i<size-2; i++){
prev=prev.next;
   }
int val=prev.next.data;
prev.next=null;
tail=prev;
size--;
return  val;
}

//! To show the data
public void show(){
if(head==null){
System.out.println("LinkedList is empty");
}
Node temp=head;
while (temp !=null) {
    System.out.print(temp.data+"=>");
    temp=temp.next;
}
System.out.println(" ");
} 
public static void main(String[] args) {
    Practice ll=new Practice();
    ll.addFirst(3);
    ll.show();
    ll.addFirst(2);
    ll.show();
    ll.addFirst(1);
ll.show();
ll.addLast(4);
ll.show();
System.out.println(ll.size);
ll.ReStart();
ll.show();
System.out.println(ll.size);
ll.ReEnd();
ll.show();
System.out.println(ll.size);
}
}
