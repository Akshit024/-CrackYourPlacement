package LinkedList.Medium;

import LinkedList.Easy.ListNode;

public class Add_Two_Numbers_II {
    ListNode reverse(ListNode root){
        ListNode ans =null;
        ListNode temp = root;
        while(temp!=null){
            ListNode curr = new ListNode(temp.val);
            curr.next = ans;
            ans = curr;
            temp=temp.next;
        }

        return ans;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode L1 = reverse(l1);
        ListNode L2 = reverse(l2);

        ListNode ans = null;
        int carry =0;
        while(L1!=null || L2!=null){
            int data =carry;
            if(L1!=null){
                data+=L1.val;
                L1=L1.next;
            }
            if(L2!=null){
                data+=L2.val;
                L2=L2.next;
            }
            carry=data/10;
            data %= 10;
            ListNode curr = new ListNode(data);
            curr.next = ans;
            ans = curr;
        }
        if(carry==1){
            ListNode curr = new ListNode(1);
            curr.next = ans;
            ans = curr;
        }
        return ans;
    }
}
