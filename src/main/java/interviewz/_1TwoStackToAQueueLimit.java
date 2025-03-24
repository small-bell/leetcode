package interviewz;

import java.util.Stack;

public class _1TwoStackToAQueueLimit {
    private Stack<Integer> inStack;  // 负责入队
    private Stack<Integer> outStack; // 负责出队
    private int limit;         // 每个栈的最大大小

    public _1TwoStackToAQueueLimit(int limit) {
        this.limit = limit;
        this.inStack = new Stack<>();
        this.outStack = new Stack<>();
    }

    // 入队操作
    public boolean enqueue(Integer item) {
        if (inStack.size() >= limit) {
            return false; // 入队失败，栈满了
        }
        inStack.push(item);
        return true;
    }

    // 出队操作
    public Integer dequeue() {
        if (outStack.isEmpty()) {
            // 只有 inStack 为空时，才表示真正的空队列
            if (inStack.isEmpty()) {
                throw new RuntimeException("队列为空，无法出队");
            }
            // 把 inStack 中的元素倒入 outStack
            while (!inStack.isEmpty() && outStack.size() < limit) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    // 获取队列大小
    public int size() {
        return inStack.size() + outStack.size();
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // 获取队首元素（不出队）
    public Integer peek() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty() && outStack.size() < limit) {
                outStack.push(inStack.pop());
            }
        }
        if (outStack.isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return outStack.peek();
    }

}
