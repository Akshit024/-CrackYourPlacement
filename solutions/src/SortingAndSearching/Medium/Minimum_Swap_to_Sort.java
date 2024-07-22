package SortingAndSearching.Medium;
import java.util.*;

public class Minimum_Swap_to_Sort {
    public int minSwaps(int nums[])
    {
        int n = nums.length;
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }

        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=nums[i]){
                int pos = map.get(arr[i]);
                nums[pos]=nums[i];
                count++;
                map.put(nums[i],pos);
            }
        }
        return count;
    }
}
