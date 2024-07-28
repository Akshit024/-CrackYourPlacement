package LinkedList.Medium;

import LinkedList.Easy.ListNode;

public class Reverse_Linked_List_II {
    public ListNode reverse(ListNode start, int i){
        ListNode curr = start.next;
        ListNode prev = new ListNode(start.val);
        while(curr!=null && i>=1){
            ListNode temp = new ListNode(curr.val);
            temp.next=prev;
            prev=temp;
            curr=curr.next;
            i--;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left>=right) return head;
        ListNode start = head;
        int i=1;
        while(start!=null && i!=left){
            i++;
            start=start.next;
        }
        i=right-left;
        ListNode rev = reverse(start,i);

        while(rev!=null && start!=null){
            start.val=rev.val;
            start=start.next;
            rev=rev.next;
        }

        return head;

    }
}
