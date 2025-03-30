package classes.monotonic_stack;

import java.util.*;

public class _739每日温度 {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();

        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                Integer pop = stack.pop();
                res[pop] = i - pop;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = 0;
        }
        return res;
    }
}
