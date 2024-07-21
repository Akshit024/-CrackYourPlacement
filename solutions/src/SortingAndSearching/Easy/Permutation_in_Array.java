package SortingAndSearching.Easy;
import java.util.*;

public class Permutation_in_Array {
    public boolean isPossible(long a[], long b[], long n, long k) {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]+b[(int)(n-i-1)]<k) return false;
        }
        return true;
        // Your code goes here
    }
}
