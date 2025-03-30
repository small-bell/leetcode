package classes.monotonic_stack;

import java.util.Stack;

public class _1475商品折扣后的最终价格 {

    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                Integer pop = stack.pop();
                ans[pop] = prices[pop] - prices[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            ans[pop] = prices[pop];
        }
        return ans;
    }

}
