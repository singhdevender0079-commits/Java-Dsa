package LinkedList.practice;

public class AddLast {
    public class Node{
int data;
Node next;
public Node(int data){
    this.data=data;
    this.next=null;
}
    } 
    public  static Node head;
    public  static Node tail;
    public  void addLast(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
        }
tail.next=newNode;
tail=newNode;
    }
    public void show(){
        Node temp=head;;
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
        AddLast ll= new AddLast();
    ll.addLast(1);
    ll.show();
    ll.addLast(2);
        ll.show();
    ll.addLast(3);
        ll.show();
    }
}
