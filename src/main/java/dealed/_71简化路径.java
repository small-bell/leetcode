package dealed;

import java.util.Deque;
import java.util.LinkedList;

public class _71简化路径 {
    class Solution {
        public String simplifyPath(String path) {
            Deque<String> queue = new LinkedList<>();
            String[] res = path.split("/");
            for (int i = 0; i < res.length; i++) {
                if ( ".".equals(res[i]) || "".equals(res[i])) {
                    continue;
                } else if (res[i].equals("..")) {
                    if (!queue.isEmpty()) {
                        queue.pollLast();
                    }
                } else {
                    queue.offer(res[i]);
                }
            }
            StringBuilder builder = new StringBuilder("/");
            while (!queue.isEmpty()) {
                builder.append(queue.poll());
                if (!queue.isEmpty()) {
                    builder.append("/");
                }
            }
            return builder.toString();
        }
    }
}
