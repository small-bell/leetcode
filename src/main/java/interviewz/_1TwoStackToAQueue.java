package interviewz;

import java.util.Stack;

public class _1TwoStackToAQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void add(Integer val) {
        stack1.push(val);
        move();
    }

    public void move() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public Integer poll() {
        move();
        return stack2.pop();
    }

    public Integer peek() {
        move();
        return stack2.peek();
    }

}
