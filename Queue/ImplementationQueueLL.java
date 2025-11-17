package Queue;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class MyQueue{
    Node head;
    Node tail;
    int size;

    void add(int ele){
        Node newNode= new Node(ele);
        if(size==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }

        size++;
    }

    int peek(){
        return head.data;
    }

    int remove(){
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;;
        }
        System.out.print("Null");
    }
}

public class ImplementationQueueLL {
    public static void main(String[] args) {
        MyQueue q= new MyQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.display();


    }
}
