package dealed;

public class _3502到达每个位置的最小费用 {
    public int[] minCosts(int[] cost) {
        for (int i = 1; i < cost.length; i++) {
            cost[i] = Math.min(cost[i - 1], cost[i]);
        }
        return cost;
    }
}
