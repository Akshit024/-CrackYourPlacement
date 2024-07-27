package LinkedList.Easy;

public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode rev = null;
        while(curr!=null){
            ListNode temp = new ListNode(curr.val);
            temp.next=rev;
            rev=temp;
            curr=curr.next;
        }

        while(head!=null){
            if(rev.val!=head.val) return false;
            rev=rev.next;
            head=head.next;
        }

        return true;
    }
}
