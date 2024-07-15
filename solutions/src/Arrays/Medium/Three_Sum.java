package Arrays.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class Three_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> m =new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                List<Integer> m1 =new ArrayList<>();
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    m1.add(nums[i]);
                    m1.add(nums[low]);
                    m1.add(nums[high]);
                    if(!set.contains(m1)){
                        m.add(m1);
                    }
                    set.add(m1);
                    low++;
                    high--;
                }
                else if(sum>0) high--;
                else low++;
            }
        }
        return m;
    }
}
