package classes.binary;

public class _744寻找比目标字母大的最小字母 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        target = (char) (target + 1);
        while (l <= r) {
            int mid = (l+r)/2;
            if (letters[mid] == target) {
                return target;
            } else if (letters[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (l < letters.length && letters[l] > target - 1) return letters[l];
        return letters[0];
    }
}
