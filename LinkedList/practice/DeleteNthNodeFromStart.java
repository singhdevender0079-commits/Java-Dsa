package LinkedList.practice;

public class DeleteNthNodeFromStart {
   public class Node {
int data;
Node next;
public  Node(int data){
this.data=data;
this.next=null;
}
}
public static Node head;
public  static  Node tail;

public void addFirst(int data){
Node newNode=new Node(data);
if(head==null){
head=tail=newNode;
return ;
}
newNode.next=head;
head=newNode;
}

public void DelteNode(int index){
    if(head==null){
        System.out.println("Linked list is empty");
    }
    Node temp=head;
    if(index==0){
      head=head.next;
return ;
    }

for(int i=1;  i<=index-1;i++){
    temp=temp.next;
      
}
 if (temp.next == tail) {
            tail = temp;
        }
temp.next=temp.next.next;
}

public void  show(){
Node temp =head;
while (temp!=null) {
     if(head==null){
        System.out.println("LinkedList is empty");
        return ;
    }
    System.out.print(temp.data + " => ");
    temp=temp.next;
}
System.out.println(" ");
}
public static void main(String[] args) {
    DeleteNthNodeFromStart ll= new DeleteNthNodeFromStart();
ll.addFirst(3);
ll.show();
ll.addFirst(2);
ll.show();
ll.addFirst(1);
ll.show();
ll.DelteNode(1);
ll.show();
}
}
