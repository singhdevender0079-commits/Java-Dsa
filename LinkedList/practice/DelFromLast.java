package LinkedList.practice;

public class DelFromLast {
        public  class  Node {
    int data;
    Node next;
    public Node(int data){
this.data=data;
this.next=null;
    }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
     
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
Node newNode=new Node(data);
size++;
if(head==null){
    head=tail=newNode;
   
    return ;
}
tail.next=newNode;
tail=newNode;
    }
public int delFront(){
    if(size==0){
System.out.println("ll is empty");
return Integer.MIN_VALUE;
    }
    if(size==1){
        int  val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int  val=head.data;
    head=head.next;
    size--;
    return val;
}
public int delLast(){
    if(size==0){
System.out.println("ll is empty");
return Integer.MIN_VALUE;
    }
    if(size==1){
        int  val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node prev= head;
for(int i=0;i<size-2; i++){
    prev=prev.next;
}
int val=prev.next.data;
prev.next=null;
tail=prev;
size--;
return val;
}

    public void show(){
        Node temp=head;
        if(head==null){
            System.out.println("ll is empty");
        }
        while (temp!=null) {
            System.out.print(temp.data+ "=>");
            temp=temp.next;
        }
        System.out.println(" ");
    }
public static void main(String[] args) {
    DelFromLast ll=new DelFromLast();
ll.addFirst(3);
ll.show();
System.out.println(ll.size);
ll.addFirst(2);
ll.show();
System.out.println(ll.size);
ll.addFirst(1);
ll.show();
System.out.println(ll.size);
ll.addLast(4);
ll.show();
System.out.println(ll.size);
System.out.println(ll.delFront());
ll.show();
System.out.println(ll.delLast());
System.out.println(ll.size);
ll.show();
}
}