package LinkedList.Easy;
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}
public class Multiply_two_linked_lists {
    public long multiplyTwoLists(Node l1, Node l2) {
        // Code here4
        long m = 1000000007;
        long n1 =0, n2=0;

        Node temp = l1;
        while(temp!=null){
            n1 = (n1*10)%m+temp.data;
            temp = temp.next;
        }
        temp = l2;
        while(temp!=null){
            n2 = (n2*10)%m + temp.data;
            temp = temp.next;
        }

        return (n1*n2) % m;
    }
}
