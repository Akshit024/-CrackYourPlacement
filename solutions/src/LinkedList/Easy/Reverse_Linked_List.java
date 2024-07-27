package LinkedList.Easy;

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode pre =null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
}
