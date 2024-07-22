package SortingAndSearching.Medium;

public class Smallest_Positive_Number {
    static int missingNumber(int arr[], int size)
    {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=0) arr[i] = n+2;
        }

        for(int i=0;i<n;i++){
            int num = Math.abs(arr[i]);
            if(num<=n){
                if(arr[num-1]<0) continue;
                arr[num-1] *= -1;
            }
        }


        for(int i=0;i<n;i++){
            if(arr[i]>0) return i+1;
        }

        return n+1;
    }
}
