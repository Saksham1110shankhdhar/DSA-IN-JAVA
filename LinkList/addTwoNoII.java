package LinkList;

public class addTwoNoII {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode Next=head.next.next;

        int ans[]={-1,-1};

        if(Next==null){
            return ans;
        }

        int idx=1;
        int first=-1;
        int last=-1;
        int min=Integer.MAX_VALUE;
        
        while(Next!=null){
    
            if((curr.val<prev.val && curr.val<Next.val) || (curr.val>prev.val && curr.val>Next.val)){
        
        if(first==-1){
            first=idx;
        }

        if(last!=-1){
            int dis=idx-last;
            min=Math.min(min,dis);
        }

        last=idx;
            }
    
      idx++;
      prev=prev.next;
      curr=curr.next;
      Next=Next.next;
        }

       int max=last-first;

    if(min!=Integer.MAX_VALUE){
        ans[0]=min;
        ans[1]=max;
    }

    return ans;
    }

   
}

