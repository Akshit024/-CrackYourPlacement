package SortingAndSearching.Hard;
import java.util.*;

public class Aggressive_cows {
    public static int solve(int n, int K, int[] arr) {

        Arrays.sort(arr);

        int start = 0;

        int max = -1;

        for(int i=0; i<n; i++){

            max = Math.max(max, arr[i]);

        }

        int end = max;

        int ans = -1;



        int mid = start + (end - start) / 2;



        while(start <= end){

            if(isPossibleSolution(arr, n, K, mid)){

                ans = mid;

                start = mid+1;

            }

            else{

                end = mid - 1;

            }

            mid = start + (end - start) / 2;

        }

        return ans;

    }

    public static boolean isPossibleSolution(int[] arr, int n, int K, int mid){



        int Count_cow = 1;

        int lastpos = arr[0];



        for (int i = 0; i < n; i++) {



            if(arr[i] - lastpos >= mid){

                Count_cow ++;

                if(Count_cow == K){

                    return true;

                }

                lastpos = arr[i];

            }

        }

        return false;

    }
}
