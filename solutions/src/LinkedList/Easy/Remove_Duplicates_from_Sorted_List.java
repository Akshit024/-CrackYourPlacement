package LinkedList.Easy;

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev =head;
        ListNode curr =head;
        while(curr!=null){
            while(curr.next!=null && curr.val==curr.next.val) curr=curr.next;
            prev.next=curr.next;
            prev=prev.next;
            curr=curr.next;
        }

        return head;
    }
}
