package interviewz;

import netscape.security.UserTarget;

import java.util.Stack;

public class _1ReverseAStack {



    public void reverse(Stack<Integer> s) {
        if (s.isEmpty()) return;
        Integer pop = s.pop();
        reverse(s);
        s.push(pop);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        
        new _1ReverseAStack().reverse(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
