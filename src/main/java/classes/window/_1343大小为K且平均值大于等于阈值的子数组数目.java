package classes.window;

public class _1343大小为K且平均值大于等于阈值的子数组数目 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, ans = 0, target = threshold * k;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i < k - 1) continue;
            if (sum >= target) ans ++;
            sum -= arr[i - k + 1];
        }
        return ans;
    }
}
