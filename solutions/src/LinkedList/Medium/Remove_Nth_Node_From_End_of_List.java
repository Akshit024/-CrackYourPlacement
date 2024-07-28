package LinkedList.Medium;

import LinkedList.Easy.ListNode;

public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len =0;
        ListNode h =head;
        while(h!=null){
            len++;
            h=h.next;
        }
        if(len==n) return head.next;
        len-=n;
        h=head;
        while(len!=1){
            h=h.next;
            len--;
        }
        h.next=h.next.next;
        return head;
    }
}
