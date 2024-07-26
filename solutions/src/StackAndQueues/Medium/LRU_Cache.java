package StackAndQueues.Medium;

import java.util.HashMap;

class Node{
    int key;
    int data;
    Node prev;
    Node next;

    Node(int data,int key){
        this.key=key;
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class LRU_Cache {
    private HashMap<Integer,Node> map;
    private final int CAPACITY;
    private Node head;
    private Node end;
    public LRU_Cache(int capacity) {
        CAPACITY = capacity;
        head = new Node(-1, -1);
        end = new Node(-1, -1);
        head.next = end;
        end.prev = head;
        map = new HashMap<>();
    }
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node curr = map.get(key);
        put(curr.key,curr.data);
        return curr.data;
    }
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node curr = map.get(key);
            Node next = curr.next;
            Node prev = curr.prev;
            prev.next = next;
            next.prev = prev;
            curr.next = null;
            curr.prev = null;
        }
        Node node =  new Node(value,key);
        Node next = head.next;
        head.next = node;
        node.next = next;
        node.prev = head;
        next.prev = node;
        map.put(key,node);
        if(map.size()>CAPACITY){
            Node curr = end.prev;
            Node prev = curr.prev;
            prev.next = end;
            end.prev = prev;
            map.remove(curr.key);
        }
    }
}
