package Arrays.Medium;

import java.util.HashMap;

public class Subarray_Sums_Divisible_by_K {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int count =0;
        for(int i : nums){
            sum = sum + i;
            sum = sum%k;
            if(sum<0) sum = sum + k;
            if(map.containsKey(sum)){
                count = count + map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
