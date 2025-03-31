package classes.priorityqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _2336无限集中的最小数字 {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Map<Integer, Integer> map = new HashMap<>();
    int small = 1;
    public int popSmallest() {
        if (!pq.isEmpty()) {
            int smallest = pq.poll();
            map.remove(smallest); // 从 map 里删除，确保不会重复使用
            return smallest;
        }
        return small++;
    }

    public void addBack(int num) {
        if (num >= small) return;
        if (map.get(num) != null && map.get(num) > 0) return;

        map.merge(num, 1, Integer::sum);
        pq.add(num);
    }

}
