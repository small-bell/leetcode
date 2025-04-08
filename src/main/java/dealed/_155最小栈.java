package dealed;

import java.util.Stack;

public class _155最小栈 {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public void push(int val) {
        st1.push(val);
        if (!st2.isEmpty() &&st2.peek() <val) st2.push(st2.peek());
        else st2.push(val);
    }

    public void pop() {
        st2.pop();
        st1.pop();
    }

    public int top() {
        return st1.peek();
    }

    public int getMin() {
        return st2.peek();
    }
}
