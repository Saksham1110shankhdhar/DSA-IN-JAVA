package LinkList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next= null;
    }
}

public class basicOFlinklist {

    public static void displayRecursion(Node head){
        if(head==null){
            System.out.print("NULL");
            return;
        }
        System.out.print(head.data+"->");

        displayRecursion(head.next);
    } 

     public static void print(Node head) {
        Node temp= head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next; 
        }
        System.out.print("NULL");
     }


      public static int length(Node head) {
        Node temp= head;

        int count=0;

        while(temp!=null){
            temp=temp.next;
            count++;
        }

        return count;
        
     }

     public static void insertAtPos(int pos, int data,Node head){

        if(pos==0){
            Node newNode= new Node(data);
            newNode.next=head;
            head=newNode;
        }

        if(pos==length(head)){
            Node newNode = new Node(data);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            return;
        }
        Node newNode= new Node(data);

        Node temp=head;

        for(int i=1;i<=pos-1;i++){
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;

  }
      public static int get(int idx, Node head){
        Node temp=head;

        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;

      }

      public static void deleteAtPos(int pos, Node head)throws Exception{
        if(pos<0 || pos>length(head)){
            throw new Exception("Invalid Position");
        }
        Node temp=head;

        for(int i=1;i<=pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

      }


    public static void main(String[] args)throws Exception {
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;

        print(a);

        System.out.println();

        displayRecursion(a);

        System.out.println();

        System.out.println(length(a));

        insertAtPos(2, 25, a);
        print(a);

        deleteAtPos(3, a);
        print(a);
    }

   
}
