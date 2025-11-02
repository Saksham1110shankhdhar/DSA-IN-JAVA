package LinkList;

public class middleOFLinklist {
    public static int middleNode(Node head){
        int len= length(head);
        int mid=len/2;

        Node temp=head;

       for(int i=1;i<=mid;i++){
           temp=temp.next;
       }

       return temp.data;
    }

    static int length(Node head){
        Node temp=head;
        int count=0;

        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static int middle(Node head){
        Node s=head;
        Node f=head;

        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }

        return s.data;
    }
}
