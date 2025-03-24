package basic.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr = new int[] {5, 3, 4, 2, 2, 1};
        int[] arr = new int[] {5, 4, 3, 4,5 };
        new BubbleSort().bubbleSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void bubbleSort(int[] arr, int l, int r) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    Utils.swap(arr, i, j);
                }
            }
        }
    }


}
