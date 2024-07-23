package SortingAndSearching.Hard;
import java.util.*;

public class Count_of_Smaller_Numbers_After_Self {
    void margArr(int s,int mid,int e,int arr[][],int ans[]){
        int i=s;
        int j=mid+1;
        ArrayList<int[]> list = new ArrayList<>();
        while(i<=mid && j<=e){
            if(arr[i][0]>arr[j][0]){
                list.add(arr[i]);
                ans[arr[i][1]] += e - j + 1;
                i++;
            }else{
                list.add(arr[j++]);
            }
        }

        while(i<=mid){
            list.add(arr[i++]);
        }

        while(j<=e){
            list.add(arr[j++]);
        }

        int k = s;

        for(int[] curr:list){
            arr[k++]=curr;
        }

    }
    void marg(int i,int j,int arr[][],int ans[]){
        if(j>i){
            int mid = (i+j)/2;
            marg(i,mid,arr,ans);
            marg(mid+1,j,arr,ans);
            margArr(i,mid,j,arr,ans);
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        marg( 0, n - 1, arr,ans);
        List<Integer> result = new ArrayList<>();
        for (int num : ans) {
            result.add(num);
        }
        return result;
    }
}
