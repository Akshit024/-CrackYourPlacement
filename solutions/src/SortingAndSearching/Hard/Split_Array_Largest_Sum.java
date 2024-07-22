package SortingAndSearching.Hard;

public class Split_Array_Largest_Sum {
    boolean find(int num,int nums[],int k){
        int sum =0;
        for(int i:nums){
            if(sum+i>num){
                sum =0;
                k--;
            }
            sum +=i;
        }

        return k>0;
    }
    public int splitArray(int[] nums, int k) {
        int s =0;
        int e = 0;
        for(int i:nums){
            e+=i;
            s=Math.max(s,i);
        }
        int ans =0;
        while(e>=s){
            int mid = (s+e)/2;
            if(find(mid,nums,k)){
                e=mid-1;
                ans = mid;
            }
            else{
                s=mid+1;
            }
        }

        return ans;
    }
}
