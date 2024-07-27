package LinkedList.Easy;

public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode ans1 = null;
        ListNode ans2 = null;
        if (l1.val > l2.val) {
            ans1 = l2;
            ans2 = ans1;
            l2 = l2.next;
        } else {
            ans1 = l1;
            ans2 = ans1;
            l1 = l1.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                ans2.next = l2;
                ans2 = ans2.next;
                l2 = l2.next;
            } else {
                ans2.next = l1;
                ans2 = ans2.next;
                l1 = l1.next;
            }
        }
        if(l1 != null) {
            ans2.next = l1;
        }
        if(l2 != null) {
            ans2.next = l2;
        }
        return ans1;
    }
}
