package Mathematical.Medium;

public class Minimum_Moves_to_Equal_Array_Elements_II {
    public int minMoves2(int[] nums) {
        int count =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            count += nums[nums.length-i-1]-nums[i];
        }

        return count;
    }
}
