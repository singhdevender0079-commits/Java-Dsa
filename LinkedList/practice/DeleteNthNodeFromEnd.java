package LinkedList;

public class DeleteNthNodeFromEnd {
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

public  void addData(int data){
Node newNode=new Node(data);
if(head==null){
head=tail=newNode;
return;
}
newNode.next=head;
head=newNode;
}

public void deleteNth(int n){
Node temp=head;
int size=0;
while (temp != null) {
    temp=temp.next;
    size++;
}
if(size==n){
head=head.next;
return ;
}
int i=1;
int itodata=size-n;
Node prev=head;
while (i<itodata) {
    prev=prev.next;
    i++;
}
prev.next=prev.next.next;
return ;

}



public void show(){
    Node temp=head;
    while (temp != null) {
        System.out.print(temp.data+ " => ");
temp=temp.next;
    }
    System.out.println(" ");
};

public static void main(String[] args) {
    DeleteNthNodeFromEnd ll=new DeleteNthNodeFromEnd();
        ll.addData(5);
ll.show();
            ll.addData(4);
            ll.show();
    ll.addData(3);
    ll.show();
    ll.addData(2);
    ll.show();
    ll.addData(1);
ll.show();
ll.deleteNth(2);
ll.show();

}

}
