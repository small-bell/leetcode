package dealed;

public class _11盛最多水的容器 {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;
        while (l < r) {
            int cur = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(res, cur);
            if (height[l] < height[r]) {
                l ++;
            } else {
                r --;
            }
        }
        return res;
    }
}
