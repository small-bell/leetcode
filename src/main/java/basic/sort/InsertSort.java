package basic.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
//        int[] arr = new int[] {5, 3, 4, 2, 2, 1};
        int[] arr = new int[] {5, 4, 3, 4,5 };
        new InsertSort().insertSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void insertSort(int[] arr, int i, int i1) {

    }


}
