package LinkList;

public class rotateLinkList {
     static Node rotate(Node head, int k){
        Node s=head;
        Node f=head;

        int temp=length(head);

        if(k>=temp){
            k=k%temp;
        }

        for(int i=1;i<=k;i++){
            f=f.next;
        }

        while(f.next!=null){
            s=s.next;
            f=f.next;
        }

        Node new_Node=s.next;
        s.next=null;
        f.next=head;

        return new_Node;

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

   
}
