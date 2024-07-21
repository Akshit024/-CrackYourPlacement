package SortingAndSearching.Easy;
import java.util.*;

public class Find_Pair_Given_Difference {
    public boolean isContains(int[] arr,int elm,int i,int j){
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==elm){
                return true;
            }else if(arr[mid]>elm){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return false;
    }
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        for(int i = 0;i<size;i++){
            if(isContains(arr,arr[i]+n,i+1,size-1)){
                return true;
            }
        }
        return false;
    }
}
