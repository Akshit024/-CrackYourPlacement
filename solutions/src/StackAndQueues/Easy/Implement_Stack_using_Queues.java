package StackAndQueues.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues {
    Queue<Integer> q;
    public Implement_Stack_using_Queues() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++) q.add(q.remove());
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
