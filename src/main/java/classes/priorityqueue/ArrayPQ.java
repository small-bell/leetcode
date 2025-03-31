package classes.priorityqueue;

public class ArrayPQ {
    int[] a = new int[100000];
    int len = 0;

    void push(int val) {
        int idx = len;
        a[len++] = val;

        while ((idx - 1) / 2 >= 0 && a[(idx - 1) / 2] > a[idx]) {
            swap((idx - 1) / 2, idx);
            idx = (idx - 1) / 2;
        }
    }
    void swap(int l,int r) {
        int tmp = a[l];
        a[l] = a[r];
        a[r] = tmp;
    }

    int pop() {
        int top = a[0];
        a[0] = a[--len];
        int idx = 0;
        while (2*idx + 1 < len) {
            int l = 2*idx + 1, r = 2 * idx + 2, small = l;
            if (r < len && a[l] > a[r]) {
                small = r;
            }

            if (a[small] < a[idx]) {
                swap(idx, small);
                idx = small;
            } else {
                break;
            }
        }
        return top;
    }

//    int pop() {
//        int top = a[0];
//        a[0] = a[--len]; // 替换根节点，并减少长度
//        int idx = 0;
//
//        while (2 * idx + 1 < len) { // 确保左子节点存在
//            int l = 2 * idx + 1;
//            int r = 2 * idx + 2;
//            int smallest = l; // 默认左子节点最小
//
//            if (r < len && a[r] < a[l]) { // 右子节点存在且更小
//                smallest = r;
//            }
//
//            if (a[idx] <= a[smallest]) break; // 当前节点已符合堆序
//            swap(idx, smallest);
//            idx = smallest;
//        }
//        return top;
//    }
    public static void main(String[] args) {
        ArrayPQ pq = new ArrayPQ();

        for (int i = 0; i < 50; i++) {
            pq.push(i + -1 * i * 5 * 7);
        }

        for (int i = 0; i < 50; i++) {
            int pop = pq.pop();
            System.out.println(pop);
        }
    }
}
