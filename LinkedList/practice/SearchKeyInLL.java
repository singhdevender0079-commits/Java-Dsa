package LinkedList.practice;

public class SearchKeyInLL {
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

public void Search(int key){
    Node temp=head;
    int count=0;
    while (temp !=null) {
        if(temp.data==key){
    System.out.println("key is exist at index : "+count);
}
        temp=temp.next;
        count++;
    }
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
    SearchKeyInLL ll= new SearchKeyInLL();
ll.addFirst(3);
ll.show();
ll.addFirst(2);
ll.show();
ll.addFirst(1);
ll.show();
ll.Search(3);
}

}
