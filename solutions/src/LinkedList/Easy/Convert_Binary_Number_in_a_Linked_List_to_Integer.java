package LinkedList.Easy;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public int getDecimalValue(ListNode head) {
        int ans =0;
        while(head != null){
            ans = ans<<1;
            ans = ans^head.val;
            head = head.next;
        }

        return ans;
    }
}
