import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class QuickSort1 {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 3, 4, 6, 6, 4, 4, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int ll, int rr) {
        if (ll >= rr) return;
        int l = ll, r = rr, pvt = arr[ll];
        while (l < r) {
            while (l < r && arr[r] >= pvt) r --;
            while (l < r && arr[l] <= pvt) l ++;
            if (l < r) {
                swap(arr, l, r);
                l ++;
                r --;
            }
        }
        arr[ll] = arr[r];
        arr[r] = pvt;
        quickSort(arr, ll, r - 1);
        quickSort(arr, r + 1, rr);
    }

    private static void swap(int[] arr, int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }


}
