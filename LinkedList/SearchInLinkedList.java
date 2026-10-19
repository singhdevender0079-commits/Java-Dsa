package LinkedList;

public class SearchInLinkedList {
    public class Node{
        int data;
        Node next;
        public  Node(int data){
this.data=data;
this.next=null;
        }
    }
    public static  Node head;
    public  static Node tail;


public void addData(int data){
    Node newNode=new Node(data);
    
if(head==null){
    head=tail=newNode;
    return;
}
newNode.next=head;
head=newNode;
}

public int Search(int key){
    Node temp=head;
    int pos =0;
  while (temp !=null){
if (temp.data==key) {
    return pos;
}
temp=temp.next;
pos++;
  } 
  return  -1;
}
public static void main(String[] args) {
    SearchInLinkedList ll=new  SearchInLinkedList();
    ll.addData(3);
    ll.addData(2);
    ll.addData(1);
    System.out.println("The position of key : "+ll.Search(2));
}
}
