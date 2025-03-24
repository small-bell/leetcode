package interviewz;

import java.util.Stack;

public class _1GetMinStack {

    Stack<Integer> min = new Stack<>();
    Stack<Integer> cur = new Stack<>();

    public Integer pop() {
        min.pop();
        return cur.pop();
    }

    public void push(Integer val) {
        if (min.isEmpty()) {
            min.push(val);
        } else if (min.peek() < val) {
            min.push(min.peek());
        } else {
            min.push(val);
        }
        cur.push(val);
    }

    public Integer getMin() {
        return min.peek();
    }
}
