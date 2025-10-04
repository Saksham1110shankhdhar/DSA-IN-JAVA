package LinkList;

public class mergeSortForLinklist {
    class Solution {
    public Node mergeSort(Node head) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        Node s= head;
        
        Node f=head;
        
        while(f.next!=null && f.next.next!=null ){
            f=f.next.next;
            s=s.next;
        }
        Node head2=s.next;
        s.next=null;
        
        head=mergeSort(head);
        head2=mergeSort(head2);
        
        return sortedMerge(head,head2);
        
    }
    
    public Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        
        Node i=head1;
        Node j=head2;
        
        Node k=dummy;
        
        while(i!=null && j!=null){
            if(i.data<j.data){
                k.next=i;
                i=i.next;
               
            }else{
                k.next=j;
                j=j.next;
                
            }
            
            k=k.next;
        }
        
        if(i==null){
            k.next=j;
        }else{
            k.next=i;
        }
        
        return dummy.next;
        
    }
}
}
