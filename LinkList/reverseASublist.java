package LinkList;

public class reverseASublist {
    public static Node reverseBetween(int l, int r, Node head) {
      
        
        Node dummy= new Node(-1);
        dummy.next=head;
        
        Node a=null;
        Node b=null;
        Node c=null;
        Node d=null;
        
        Node temp=dummy;
        
        for(int i=0; i<r+2; i++){
            if(i==l-1){
                a=temp;
            }else if(i==l){
                b=temp;
            }else if(i==r){
                c=temp;
            }else if(i==r+1){
                d=temp;
            }else if(temp==null){
                break;
            }
            
            temp=temp.next;
        }
        
        a.next=null;
        c.next=null;
        
        reverseList(b);
        
        a.next=c;
        b.next=d;
        
        return dummy.next;
        
    }
    
    public static Node reverseList(Node head) {
        Node prev=null;
        Node curr=head;
        Node nxt=null;
        
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            
        }
        
        return prev;
    }
}