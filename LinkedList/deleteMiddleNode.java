package LinkedList;

public class deleteMiddleNode {
    public class Node {
    int data;
    Node next;
    public Node(int data){
this.data=data;
this.next=null;
    }
}
    public static Node head;
    public static Node tail;

public void addData(int data){
    Node newNode=new Node(data);

if (head==null) {
  head=tail=newNode;
  return ;
}
tail.next=newNode;
tail=newNode;
}
public void DeleteMiddleNode(){
        if (head == null || head.next == null) {
        head = tail = null;
        return;
    }

int start=0;
int end=0;
Node temp=head;
while(temp!=null){
    temp=temp.next;
    end++;
}
int middle=(start+end)/2;
Node prev=head;

for(int i=0; i<middle-1; i++){
    prev=prev.next;
}
prev.next=prev.next.next;
}
public void show(){
        Node temp=head;
        if (head==null) {
            System.out.println("ll is empty");
        }
        while (temp!=null) {
            System.out.print(temp.data+" =>");
            temp=temp.next;
        }
        System.out.println(" ");
    }

public static void main(String[] args) {
    deleteMiddleNode ll=new deleteMiddleNode();
    ll.addData(1);
    ll.addData(2);
    ll.addData(3);
ll.DeleteMiddleNode();
ll.show();
}
}

