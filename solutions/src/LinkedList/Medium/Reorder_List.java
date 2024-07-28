package LinkedList.Medium;

import LinkedList.Easy.ListNode;

import java.util.ArrayList;

public class Reorder_List {
    public void reorderList(ListNode head) {
        int len =0;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            len++;
            temp=temp.next;
        }

        temp = head;
        int n =len;
        int n2 = len/2 +1;
        while(n2<len){
            ListNode curr = new ListNode(list.get(--len));
            curr.next=temp.next;
            temp.next=curr;
            temp=temp.next.next;
        }
        temp=head;
        while(n>1){
            n--;
            temp=temp.next;
        }
        temp.next=null;
    }
}
