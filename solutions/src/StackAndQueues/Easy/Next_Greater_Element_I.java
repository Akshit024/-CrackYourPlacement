package StackAndQueues.Easy;
import java.util.*;

public class Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }
        int n = nums2.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(nums2[n-1]);
        if(map.containsKey(nums2[n-1])){
            nums1[map.get(nums2[n-1])]=-1;
        }
        for(int i=n-2;i>=0;i--){
            int val = nums2[i];
            while(!pq.isEmpty() && pq.peek()<val) pq.poll();
            if(map.containsKey(val)){
                if(pq.isEmpty()) nums1[map.get(val)]=-1;
                else nums1[map.get(val)]=pq.peek();
            }

            pq.add(val);
        }

        return nums1;
    }
}
