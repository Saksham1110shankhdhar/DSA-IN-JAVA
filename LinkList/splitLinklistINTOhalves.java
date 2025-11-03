package LinkList;

public class splitLinklistINTOhalves {
      public Pair<Node, Node> splitList(Node head) {
        
        Node s=head;
        Node f=head;
        
        Node tail=head;
        
        while(tail.next!=head){
            tail=tail.next;
        }
        
        
        while(f.next!=head && f.next.next!=head){
            f=f.next.next;
            s=s.next;
        }
        
        Node a=s.next;
        s.next=head;
       
       
        tail.next=a;
        
        return new Pair<>(head,a);
        
        
    }
}

// Simple package-private Pair implementation to avoid dependency on JavaFX
class Pair<T, U> {
    public final T first;
    public final U second;
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
