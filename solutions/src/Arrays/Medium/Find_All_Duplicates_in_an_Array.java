package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int pos = (arr[i]%(n+1))-1;
            arr[pos]+=(n+1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]/(n+1)>=2) ans.add(i+1);
        }
        return ans;
    }
}
