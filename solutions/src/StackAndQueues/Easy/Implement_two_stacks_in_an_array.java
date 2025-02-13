package StackAndQueues.Easy;

public class Implement_two_stacks_in_an_array {
    int arr[];
    int size;
    int top1, top2;
    Implement_two_stacks_in_an_array()
    {
        size = 100;
        arr = new int[100];
        top1 = -1;
        top2 = size;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        arr[++top1]=x;
    }

    //Function to push an integer into the stack2.
    void push2(int x)
    {
        arr[--top2]=x;
    }

    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(top1==-1)
            return -1;
        else
            return arr[top1--];
    }

    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2==size)
            return -1;
        else
            return arr[top2++];
    }
}
