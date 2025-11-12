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

    void insertAtINDX(int idx,int val) throws Exception{
        
        if(size==0){
            insertATNode(val);
        }else if(idx==size){
            insertAtTail(val);
        }else if(idx<0 || idx>size){
            throw new Exception("Invalid Index");
        }
        else{
            Node newNode = new Node(val);
            Node temp=head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }

            newNode.next=temp.next;
            temp.next.prev=newNode;
            temp.next=newNode;
            newNode.prev=temp;
            size++;
        }
    }

    int get(int idx){
        if(idx<=size/2){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        } else {
            Node temp=tail;
            for(int i=1;i<=size-idx-1;i++){
                temp=temp.prev;
            }
            return temp.data;
        }
    }

    void deleteAtHead()throws Exception{
        if(size==0){
            throw new Exception("Linked List is Empty");
        }

        head=head.next;
        if(head!=null)head.prev=null;
        size--;

    }

    void deleteAtTail()throws Exception{
        if(size==0){
            throw new Exception("List is Empty");
        }

        tail=tail.prev;
        if(tail!=null) tail.next=null;

        size--;
    }

  void deleteATpos(int idx) throws Exception{
        if(idx<0 || idx>=size){
            throw new Exception("Invalid Index");
        }

        if(idx==0){
            deleteAtHead();
        } else if(idx==size-1){
            deleteAtTail();
        } else {
            Node temp=head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }

            temp.next=temp.next.next;
            if(temp.next!=null){
                temp.next.prev=temp;
            }
            size--;
        }
    }
}

public class implementation {
    public static void main(String[] args) throws Exception{
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
        dll.deleteATpos(2);
        dll.display();
    }
  

}
