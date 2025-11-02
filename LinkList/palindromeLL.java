package LinkList;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.ArrayList;

public class palindromeLL {
    class Solution {
    public boolean isPalindrome(Node head) {
        Node s=head;
        
        Node f=head;
        
        while(f.next!=null && f.next.next!=null ){
            f=f.next.next;
            s=s.next;
        }
        Node head2=s.next;
        s.next=null;
        
        
        head2=reverseList(head2);
        
        Node i=head;
        Node j=head2;
        
        while(j!=null){
            if(i.data!=j.data){
                return false;
            }
                i=i.next;
                j=j.next;
            
        }
        return true;
        
        
    }
    
    public Node reverseList(Node head) {
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

//    public boolean isPalindrome(ListNode head) {
//         ArrayList<Integer> arr = new ArrayList<>();

//         ListNode temp=head;

//         while(temp!=null){
//             arr.add(temp.val);
//             temp=temp.next;
//         }

//         int i=0;
//         int j=arr.size()-1;

//         while(i<j){
//             if(arr.get(i)!=arr.get(j)){
//                 return false;
//             }

//             i++;
//             j--;
//         }

//         return true;
//     }
}
