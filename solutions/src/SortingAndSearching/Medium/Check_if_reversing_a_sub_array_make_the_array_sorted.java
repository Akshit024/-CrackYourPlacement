package SortingAndSearching.Medium;
import java.util.*;

public class Check_if_reversing_a_sub_array_make_the_array_sorted {
    static boolean checkReverse(int arr[], int n) {
        // Copying the array.
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // Sort the copied array.
        Arrays.sort(temp);

        // Finding the first mismatch.
        int front;
        for (front = 0; front < n; front++) {
            if (temp[front] != arr[front]) {
                break;
            }
        }

        // Finding the last mismatch.
        int back;
        for (back = n - 1; back >= 0; back--) {
            if (temp[back] != arr[back]) {
                break;
            }
        }

        // If whole array is sorted
        if (front >= back) {
            return true;
        }

        // Checking subarray is decreasing or not.
        do {
            front++;
            if (arr[front - 1] < arr[front]) {
                return false;
            }
        } while (front != back);

        return true;
    }
}
