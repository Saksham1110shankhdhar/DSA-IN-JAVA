package LinkList;

import java.util.ArrayList;

public class MergeKSortedLinkList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ArrayList<ListNode> list1 = new ArrayList<>();
        ArrayList<ListNode> list2 = new ArrayList<>();

        for (ListNode n : lists) {
            list1.add(n);
        }

        // keep merging until only one list remains
        while ((list1.size() + list2.size()) > 1) {

            while (list1.size() > 1) {
                ListNode a = list1.remove(list1.size() - 1);
                ListNode b = list1.remove(list1.size() - 1);
                ListNode c = merge(a, b);
                list2.add(c);
            }

            while (list2.size() > 1) {
                ListNode a = list2.remove(list2.size() - 1);
                ListNode b = list2.remove(list2.size() - 1);
                ListNode c = merge(a, b);
                list1.add(c);
            }

            // move leftover single list between arrays
            if (list1.size() == 1 && list2.size() == 0) {
                list2.add(list1.remove(0));
            } else if (list2.size() == 1 && list1.size() == 0) {
                list1.add(list2.remove(0));
            }
        }

        // ✅ Return the final merged list
        return (list1.size() > 0) ? list1.get(0) : (list2.size() > 0 ? list2.get(0) : null);
    }

    // Helper: merge two sorted lists
    ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // attach the remainder
        tail.next = (head1 != null) ? head1 : head2;

        return dummy.next;
    } 
}
