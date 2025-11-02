package LinkList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class partitionOfLinklist {
    public ListNode partition(ListNode head, int x) {
       ListNode d1= new ListNode(-1);
       
       ListNode d2= new ListNode(-1);
       
       ListNode i=d1;
       ListNode j=d2;
       
       ListNode temp=head;
       
       while(temp!=null){
           if(temp.val<x){
               i.next=temp;
               i=i.next;
           }else{
               j.next=temp;
               j=j.next;
           }
           
           temp=temp.next;
           
       }
       
       i.next=d2.next;
       j.next=null;
       
       
       return d1.next;
        
    }
}
