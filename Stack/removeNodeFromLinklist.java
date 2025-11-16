package Stack;
import java.util.Stack;

 class ListNode {
      int val;
      ListNode next;
      ListNode(int val){
        this.val=val;
      }
  }
 

public class removeNodeFromLinklist{
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st= new Stack<>();

        ListNode temp= head;

        while(temp!=null){
            while(st.size()>0 && st.peek().val < temp.val){
                st.pop();
            }
            st.push(temp);
            temp=temp.next;
        }

        ListNode dummy= new ListNode(-1);
        temp=dummy;

        while(st.size()>0){
            ListNode top=st.pop();
            top.next=null;
            temp.next=top;
            temp=top;
        }

        temp=dummy.next;
        dummy.next=null;

        return reverse(temp);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}
