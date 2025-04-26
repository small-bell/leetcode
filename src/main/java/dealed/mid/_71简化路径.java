package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _71简化路径 {
    public String simplifyPath(String path) {
        String[] ps = path.split("/+");
        Deque<String> st = new LinkedList<>();
        for (String s : ps)  {
            if (s.equals(".") || st.equals("")) {
                continue;
            } else if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.removeLast();
                }
            }  else {
                st.addLast(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            if (st.peekFirst().equals("")) {
                st.removeFirst();
                continue;
            }
            sb.append("/");
            sb.append(st.removeFirst());
        }
        if (sb.length() == 0) return "/";
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] split = "/home//foo/".split("/+");
        System.out.println(split.length);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }


}
