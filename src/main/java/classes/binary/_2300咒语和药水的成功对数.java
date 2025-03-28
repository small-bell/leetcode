package classes.binary;

import java.util.Arrays;

public class _2300咒语和药水的成功对数 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // xy>j => x> (j-1)/y 向下取整

        int[] res = new int[spells.length];
        int len = potions.length;
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            long tgt = (success + spells[i] - 1) / spells[i];
            int idx  = bsearch(potions, tgt);
            res[i] = len - idx;
        }
        return res;
    }

    private int bsearch(int[] potions, long tgt) {
        int l = 0, r = potions.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (potions[mid] >= tgt) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;// l >= tgt
    }
}
