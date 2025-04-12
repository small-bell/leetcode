package dealed.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _119杨辉三角ii {
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
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return new ArrayList<Integer>(){{add(1);}};
        return generate(rowIndex + 1).get(rowIndex );
    }


    private static final List<Integer>[] c = new List[34];

    static {
        c[0] = new ArrayList<Integer>(Arrays.asList(1));
        for (int i = 1; i < c.length; i++) {
            List<Integer> row = new ArrayList<>(i + 1); // 预分配空间
            row.add(1);
            for (int j = 1; j < i; j++) {
                // 左上方的数 + 正上方的数
                row.add(c[i - 1].get(j - 1) + c[i - 1].get(j));
            }
            row.add(1);
            c[i] = row;
        }
    }

    public List<Integer> getRow1(int rowIndex) {
        return c[rowIndex];
    }
}
