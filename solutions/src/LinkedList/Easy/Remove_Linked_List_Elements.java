package LinkedList.Easy;

public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }

            curr = curr.next;
        }

        return head;

    }
}
