package LinkList.DoublyLinkedlist;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data= data;
        this.next= null;
    }
}

class DoublyLinkList{
    Node head;
    Node tail;
    int size;

    void insertATNode(int data){
        Node newNode = new Node(data);

        if(size==0){
            head=tail=newNode;
        }else{
             newNode.next=head;
             head.prev=newNode;
             head=newNode;
        }
        size++;
    }

    void insertAtTail(int data){
        Node newNode = new Node(data);

        if(size==0){
            head=newNode;
            tail=newNode;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

        size++;
    }

    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    void reversedisplay(){
        Node temp=tail;

        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.prev;
        }
        System.out.print("NULL");
    }
}

public class implementation {
    public static void main(String[] args) {
        DoublyLinkList dll= new DoublyLinkList();
        dll.insertAtTail(10);
        dll.insertAtTail(15);
        dll.insertAtTail(20);

        dll.insertATNode(50);
        dll.insertATNode(55);
        dll.insertATNode(60);

        dll.display();
        System.out.println();
        dll.reversedisplay();
    }
  

}
