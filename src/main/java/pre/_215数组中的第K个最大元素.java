package pre;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class _215数组中的第K个最大元素 {

    // 优先队列
    public int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }
        for (int i = 0; i < k -1; i++) {
            pq.poll();
        }
        return pq.poll();
    }


    // 建立大顶堆
    public int findKthLargest2(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            offer(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            pop();
        }
        return pop();
    }

    int[] a = new int[10*10*10*10*10];
    int size = 0;

    private int pop() {
        if (size == 0) return -1;
        int res = a[0];
        a[0] = a[--size];
        int cur = 0;
        while (cur < size) {
            int l = 2 * cur + 1, r = 2 * cur + 2, large = cur;
            if (l <size && a[l] > a[r]) {
                large = l;
            }
            if (r < size && a[r] > a[large]) {
                large = r;
            }
            if (a[large] > a[cur]) {
                swap(a, cur, large);
            } else {
                break;
            }
            cur = large;
        }
        return res;
    }

    private void offer(int num) {
        a[size] = num;
        int cur = size++;
        while (cur > 0 && a[cur] > a[(cur - 1)/ 2]) {
            swap(a, cur, (cur - 1)/ 2);
            cur = (cur - 1)/ 2;
        }
    }

    public void swap(int[] arr, int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

    // 快速选择
    public int findKthLargest3(int[] nums, int k) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            lst.add(nums[i]);
        }
        return quickSelect(lst, k);
    }

    private int quickSelect(List<Integer> lst, int k) {
        Integer pvt = lst.get(0);
        List<Integer> small = new ArrayList<>(),
            large = new ArrayList<>(), eq = new ArrayList<>();

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > pvt) {
                large.add(lst.get(i));
            } else if (lst.get(i) < pvt) {
                small.add(lst.get(i));
            } else {
                eq.add(lst.get(i));
            }
        }

        if (k <= large.size()) {
            return quickSelect(large, k);
        } else if (lst.size() - small.size() < k)
            return quickSelect(small, k - lst.size() + small.size());
        return pvt;
    }



    //左右挖坑互填快排
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (true) {
            int idx = partition(nums, l, r);
            if (idx == k - 1)
                return nums[idx];
            else if (idx < k - 1)
                l = idx + 1;
            else
                r = idx - 1;
        }
    }


    public int partition(int [] nums, int l, int r) {
        int pivot = nums[l];
        while (l < r)
        {
            while (l < r && nums[r] <= pivot)
                r --;
            nums[l] = nums[r];
            while (l < r && nums[l] >= pivot)
                l ++;
            nums[r] = nums[l];
        }
        nums[l] = pivot;
        return l;
    }


//    class Solution
//
//    {
//
//        public int findKthLargest(int[] nums, int k)
//
//        {
//
//            int n = nums.length;
//
//            int l = 0;
//
//            int r = n - 1;
//
//            while (true)
//
//            {
//
//                int idx = partition(nums, l, r);
//
//                if (idx == k - 1)
//
//                    return nums[idx];
//
//                else if (idx < k - 1)
//
//                    l = idx + 1;
//
//                else
//
//                    r = idx - 1;
//
//            }
//
//
//
//        }
//
//
//
//        //----左右交换
//
//        public int partition(int [] nums, int l, int r)
//
//        {
//
//            int pivot = nums[l];
//
//            int begin = l;
//
//            while (l < r)
//
//            {
//
//                while (l < r && nums[r] <= pivot)
//
//                    r --;
//
//                while (l < r && nums[l] >= pivot)
//
//                    l ++ ;
//
//                if (l < r)
//
//                {
//
//                    int tmp = nums[l];
//
//                    nums[l] = nums[r];
//
//                    nums[r] = tmp;
//
//                }
//
//            }
//
//
//
//            int tmp = nums[begin];
//
//            nums[begin] = nums[l];
//
//            nums[l] = tmp;
//
//            return l;
//
//        }
//
//    }


//    class Solution
//
//    {
//
//        public int findKthLargest(int[] nums, int k)
//
//        {
//
//            int n = nums.length;
//
//            int l = 0;
//
//            int r = n - 1;
//
//            while (true)
//
//            {
//
//                int idx = partition(nums, l, r);
//
//                if (idx == k - 1)
//
//                    return nums[idx];
//
//                else if (idx < k - 1)
//
//                    l = idx + 1;
//
//                else
//
//                    r = idx - 1;
//
//            }
//
//
//
//        }
//
//
//
//        //----左右挖坑互填
//
//        public int partition(int [] nums, int l, int r)
//
//        {
//
//            int pivot = nums[l];
//
//            int idx = l;
//
//            for (int i = l + 1; i < r + 1; i ++)
//
//            {
//
//                if (nums[i] >= pivot)
//
//                {
//
//                    idx ++;
//
//                    int tmp = nums[idx];
//
//                    nums[idx] = nums[i];
//
//                    nums[i] = tmp;
//
//                }
//
//            }
//
//            int tmp = nums[l];
//
//            nums[l] = nums[idx];
//
//            nums[idx] = tmp;
//
//            return idx;
//
//        }
//
//    }


}
