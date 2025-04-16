package dealed.mid;

public class _11盛最多水的容器 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0;
        while (l < r) {
            max = Math.max(max, ( r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r]) l ++;
            else r--;
        }
        return max;
    }
}
