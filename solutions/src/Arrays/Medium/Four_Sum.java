package Arrays.Medium;
import java.util.*;

public class Four_Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;

                int l = j+1;
                int r = n-1;
                while(r>l){
                    long sum = (long)nums[i]+(long)nums[j]+(long)nums[l]+(long)nums[r];

                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[l], nums[r]);
                        ans.add(temp);
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l-1]) l++;
                        while(l<r && nums[r]==nums[r+1]) r--;
                    }else if(sum>target) r--;
                    else l++;
                }
            }
        }

        return ans;
    }
}
