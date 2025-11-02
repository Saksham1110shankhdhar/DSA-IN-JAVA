package LinkList;

import java.util.ArrayList;

public class RverseOfALinklist {
    
class Solution {
     Node reverseList(Node head) {
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

   // using recursion
    //  Node reverseList(Node head) {
         
    //      if(head==null || head.next==null){
    //          return head;
    //      }
         
    //      Node a = head.next;
    //      head.next=null;
    //      Node b= reverseList(a);
    //      a.next=head;
         
    //      return b;
    //  }

    // using arraylist
    
    // Node reverseList(Node head) {
    //     ArrayList<Node> arr = new ArrayList<>();
        
    //     Node temp=head;
        
    //     while(temp!=null){
    //         arr.add(temp);
            
    //         temp=temp.next;
    //     }
        
        
    //     for(int i=arr.size()-1;i>=1;i--){
    //         arr.get(i).next=arr.get(i-1);
    //     }
        
    //     arr.get(0).next=null;
        
    //     return arr.get(arr.size()-1);
    // }
}
}
