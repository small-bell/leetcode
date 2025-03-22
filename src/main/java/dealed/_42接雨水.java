package dealed;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class _42接雨水 {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int ll = height[l], rr = height[r];
        int res = 0;
        while (l < r ) {
            if (height[l] < height[r]) {
                if (height[l] < ll) {
                    res += ll - height[l];
                } else {
                    ll = height[l];
                }
                l ++;
            } else {
                if (height[r] < rr) {
                    res += rr - height[r];
                } else {
                    rr = height[r];
                }
                r --;
            }
        }
        return res;
    }

    // 单调栈写法，可以说是按照横层来算的
    public int trap1(int[] height) {
        int ans = 0;
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[i] >= height[st.peek()]) {
                int bottomH = height[st.pop()];
                if (st.isEmpty()) {
                    break;
                }
                int left = st.peek();
                int dh = Math.min(height[left], height[i]) - bottomH; // 面积的高
                ans += dh * (i - left - 1);
            }
            st.push(i);
        }
        return ans;

    }

}
