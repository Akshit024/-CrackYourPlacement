package Mathematical.Easy;
import java.util.*;

public class Maximum_Product_of_Three_Numbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }
}
