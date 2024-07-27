package LinkedList.Easy;

public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=0;
        int c2=0;
        for(ListNode n=headA;n!=null;n=n.next){
            c1++;
        }
        for(ListNode n=headB;n!=null;n=n.next){
            c2++;
        }
        int x=Math.abs(c2-c1);
        if(c2>=c1){
            for(int i=0;i<x;i++){
                headB=headB.next;
            }
        }
        else{
            for(int i=0;i<x;i++){
                headA=headA.next;
            }
        }

        ListNode l1=headA;
        ListNode l2=headB;
        while(l1!=null&&l2!=null){
            if(l1==l2)
                return l1;
            l1=l1.next;
            l2=l2.next;
        }
        return null;
    }
}
