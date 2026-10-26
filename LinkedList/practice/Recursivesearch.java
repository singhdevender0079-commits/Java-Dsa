package LinkedList;

public class Recursivesearch {
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
public  int helper(Node head,int key){
if(head==null){
    return  -1;
}
if (head.data==key) {
    return 0 ;
}
int idx= helper(head.next, key);

if (idx==-1) {
    return  -1;
}
return  idx+1;
}
public int recSearch(int key){
    return  helper( head, key);
}

public static void main(String[] args) {
     Recursivesearch ll=new  Recursivesearch();
    ll.addData(3);
    ll.addData(2);
    ll.addData(1);
    System.out.println(ll.recSearch(10));
}


}
