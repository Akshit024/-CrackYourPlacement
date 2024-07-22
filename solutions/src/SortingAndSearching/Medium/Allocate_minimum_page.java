package SortingAndSearching.Medium;

public class Allocate_minimum_page {
    public static boolean find(int arr[],int mid,int d){
        int t=0;
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(i>mid) return false;
            if(sum>mid){
                sum=i;
                t++;
            }
        }
        return t<d;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[] arr,int N,int d)
    {
        if(N<d) return -1;
        int s =0;
        int e =0;

        for(int i:arr){
            s=Math.max(s,i);
            e+=i;
        }
        int ans =0;
        while(e>=s){
            int mid =(s+e)/2;

            if(find(arr,mid,d)){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return ans;
        //Your code here
    }
}
