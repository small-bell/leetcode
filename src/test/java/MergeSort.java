import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 3, 4, 6, 6, 4, 4, 2};
        arr = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr, int l, int r) {
        if (l > r) return new int[] {};
        if (l == r) return new int[] {arr[l]};
        int mid = (l + r) / 2;
        int[] left = mergeSort(arr, l, mid);
        int[] right = mergeSort(arr,  mid + 1, r);

        int[] sorted = new int[r - l + 1];
        int ldx = 0, rdx = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (ldx == left.length) {
                sorted[i] = right[rdx];
                rdx ++;
            } else if (rdx == right.length) {
                sorted[i] = left[ldx];
                ldx ++;
            } else if (right[rdx] < left[ldx]) {
                sorted[i] = right[rdx];
                rdx ++;
            } else {
                sorted[i] = left[ldx];
                ldx ++;
            }
        }
        return sorted;
    }


}
