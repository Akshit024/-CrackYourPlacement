package LinkedList.Easy;

public class Delete_nodes_having_greater_value_on_right {
    Node compute(Node head)
    {
        Node rev = null;

        while(head!=null){
            Node curr = new Node(head.data);
            curr.next = rev;
            rev = curr;
            head= head.next;
        }

        int max =0;
        Node ans = null;
        while(rev!=null){
            if(max<=rev.data){
                Node curr = new Node(rev.data);
                curr.next = ans;
                ans = curr;
                max = rev.data;
            }
            rev = rev.next;
        }

        return ans;
        // your code here
    }
}
