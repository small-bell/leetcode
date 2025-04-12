package dealed.easy;

public class _191位1的个数 {
    public int hammingWeight(int n) {
        int size = 0;
        while (n > 0) {
            if ( (n & 1) == 1) size ++;
            n >>=1;
        }
        return size;
    }
}
