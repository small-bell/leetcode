package basic.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 4, 2, 1};
        new RadixSort().radixSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void radixSort(int[] arr, int l, int r) {
        int[] bucket = new int[10];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]] ++;
        }
        int j = 0;
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i]-- > 0) arr[j++] = i;
        }
    }
}
