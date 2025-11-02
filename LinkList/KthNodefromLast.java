package LinkList;

public class KthNodefromLast {
    public static int kthFromLast(Node head, int k){
       Node temp=head;
        int len=length(head);

        if(k>len){
            return -1;
        }
        int pos=len-k;

        for(int i=1;i<=pos;i++){
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

    public static int kthLast(Node head,int k){
        Node f=head;

        for(int i=1;i<=k;i++){
            if(f==null){
                return -1;
            }
            f=f.next;
        }

        Node s=head;

        while(f!=null){
            s=s.next;
            f=f.next;
        }

        return s.data;
    }
}
