package Arrays.Medium;
import java.util.*;

public class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        map.put(sum,1);
        for(int i : nums){
            sum = sum + i;

            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
