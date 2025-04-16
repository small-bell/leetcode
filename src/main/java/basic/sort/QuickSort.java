package basic.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 4, 4, 2, 2, 1};
        System.out.println(Arrays.toString(arr));
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int ll = l , rr = r, pvt = arr[l];

        while (ll < rr) {
            while (ll < rr && arr[rr] >= pvt) rr --;
            while (ll < rr && arr[ll] <= pvt) ll ++;
            if (ll < rr) {
                Utils.swap(arr,ll, rr);
            }
        }
        Utils.swap(arr, l, rr);
        quickSort(arr, l, rr - 1);
        quickSort(arr, rr + 1, r);
    }


//    public void quickSort(int[] arr, int l, int r) {
//        if (l >= r) return;
//
//        int ll = l, rr = r;
//        int pvtId = (l + r) / 2;
//        int pivot = arr[pvtId];
//        System.out.println(pivot);
//
//        while (ll <= rr) { // 关键修改：ll <= rr 而非 ll < rr
//            while (arr[ll] < pivot) ll++;
//            while (arr[rr] > pivot) rr--;
//            if (ll <= rr) {
//                Utils.swap(arr, ll, rr);
//                ll++;
//                rr--;
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println("===");
//
//        quickSort(arr, l, rr); // 关键修改：递归时 rr 作为右边界
//        quickSort(arr, ll, r); // 关键修改：递归时 ll 作为左边界
//    }

}
