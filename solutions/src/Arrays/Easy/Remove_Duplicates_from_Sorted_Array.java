package Arrays.Easy;

public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;

        while(i<nums.length){
            while(i<nums.length && nums[i]==nums[i-1]){
                i++;
            }
            if(i<nums.length) {
                nums[j]=nums[i];
                i++;
                j++;
            }
        }
        return j;
    }
}
