package Arrays.Hard;
import java.util.*;


public class Reverse_Pairs {
    static int find(int l,int mid,int r,int arr[]){
        int count=0;
        int i=l;
        for(int j=mid+1;j<=r;j++)
        {
            while(i<=mid && arr[i]<=(long)2*(long)arr[j]) i++;
            count += mid-i+1;
        }

        return count;
    }
    static int marg(int l,int mid,int r,int arr[] ){
        int i=l;
        int j=mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(i<=mid && j<=r){
            if(arr[i]>arr[j]){
                temp.add(arr[j++]);
            }else{
                temp.add(arr[i++]);
            }
        }

        while(i<=mid){
            temp.add(arr[i++]);
        }

        while(j<=r){
            temp.add(arr[j++]);
        }
        int count = find(l,mid,r,arr);

        for(i=0;i<temp.size();i++){
            arr[l+i]=temp.get(i);
        }

        return count;
    }

    static int margSort(int i,int j,int arr[]){
        int count =0;
        if(j>i){
            int mid = (i+j)/2;
            count += margSort(i,mid,arr);
            count += margSort(mid+1,j,arr);
            count += marg(i,mid,j,arr);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        return margSort(0,nums.length-1,nums);
    }
}
