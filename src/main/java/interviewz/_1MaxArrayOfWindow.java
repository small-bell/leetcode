package interviewz;

import java.util.Arrays;
import java.util.LinkedList;

public class _1MaxArrayOfWindow {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 3, 5, 4, 3,3,6,7};
        int w = 3;
        int[] res = new int[arr.length - w + 1];
        LinkedList<Integer> ls = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            while (!ls.isEmpty() && arr[ls.peekLast()] <= arr[i]) {
                ls.pollLast();
            }
            ls.addLast(i);
            if (i < w - 1) continue;
            if (ls.peekFirst() == i - w ) {
                ls.pollFirst();
            }
            Integer pf = ls.peekFirst();
            res[i - w + 1] = arr[pf];
        }
        System.out.println(Arrays.toString(res));
    }
}
