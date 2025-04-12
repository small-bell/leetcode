package dealed.easy;

import java.util.ArrayList;
import java.util.List;

public class _118杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>() {{add(1);}});
        for (int i = 2; i <= numRows; i++) {
            List<Integer> pre = ans.get(i - 2);
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    curr.add(1);
                } else {
                    curr.add(pre.get(j) + pre.get(j - 1));
                }
            }
            ans.add(curr);
        }
        return ans;
    }
}
