import basic.sort.Utils;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
//        int[] arr = new int[] {5,1,3,7,2,1,4,5,5,9};
        int[] arr = new int[] {1, 2, 3, 4, 5};
        new QuickSort().quickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int l, int r) {

        if (l >= r) return;
        int ll = l - 1, rr = r + 1, pvt = arr[(l + r) / 2];
        while (ll <= rr) {
            do {
                ll ++;
            } while (arr[ll] > pvt);
            do {
                rr--;
            } while (arr[rr] < pvt);
            if (ll < rr ) {
                Utils.swap(arr, ll, rr);
            }
        }
        quickSort(arr, l, rr - 1);
        quickSort(arr, rr + 1, r);
    }

    private void quickSort1(int[] arr, int l, int r) {
        if (l >= r) return;
        int ll = l, rr = r, pvt = arr[l];

        while (ll < rr) {
            while (ll < rr && arr[rr] >= pvt) rr --;
            while (ll < rr && arr[ll] <= pvt) ll ++;
            if (ll < rr ) Utils.swap(arr, ll, rr);
        }

        arr[l] = arr[ll];
        arr[ll] = pvt;

        quickSort1(arr, l, ll - 1);
        quickSort1(arr, ll + 1, r);
    }

    private void quickSort2(int[] arr, int l, int r) {
        if (l >= r) return;
        int ll = l, rr = r, pvt = arr[(l + r) / 2];

        while (ll < rr) {
            while (ll < r && arr[ll] < pvt) ll ++;
            while (l < rr && arr[rr] > pvt) rr --;
            if (ll <= rr) {
                Utils.swap(arr, ll, rr);
                ll ++;
                rr --;
            }
        }
        quickSort2(arr, l, rr);
        quickSort2(arr, ll, r);

    }
}
