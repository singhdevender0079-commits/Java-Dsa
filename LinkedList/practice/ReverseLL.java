package LinkedList.practice;

public class ReverseLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

public void reverse(){
Node prev=null;
Node curr=head;
tail=head;
Node next;
while (curr!=null) {
    next=curr.next;
    curr.next=prev; /* yahan maine cuurnt ke next ko previos se jod diya hai */
  prev=curr; /*yaha maine crruent ko previous bana diya hai */
    curr=next; /*phir main agle node par chala gya */
    
}

    head = prev;
}

    public void show() {
        Node temp = head;
        while (temp != null) {
            if (head == null) {
                System.out.println("LinkedList is empty");
                return;
            }
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.show();
        ll.reverse();
        ll.show();
     
    }

}
