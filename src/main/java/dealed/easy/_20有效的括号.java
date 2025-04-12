package dealed.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class _20有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( c== '{' || c == '[' || c == '(') {
                st.push(c);
            } else if (st.isEmpty()) {
                return false;
            } else {
                if ((c== '}' && st.peek() == '{') ||
                        (c == ']' && st.peek() == '[') ||
                        (c == ')' &&  st.peek() == '(')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }


    public boolean isValid1(String s) {
        if (s.length() % 2 != 0) { // s 长度必须是偶数
            return false;
        }
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(')'); // 入栈对应的右括号
            } else if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if (st.isEmpty() || st.pop() != c) { // c 是右括号
                return false; // 没有左括号，或者左括号类型不对
            }
        }
        return st.isEmpty(); // 所有左括号必须匹配完毕
    }

}
