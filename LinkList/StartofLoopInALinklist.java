package LinkList;
public class StartofLoopInALinklist {

    public int cycleStart(Node head){
        Node S=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            S=S.next;

            if(S==fast){
                break;
            }

            if(fast==null || fast.next==null){
                return -1;
            }

            Node temp=head;
            while(temp!=S){
                temp=temp.next;
                S=S.next;
            }

            
        }

        return S.data;
    }
    
}
