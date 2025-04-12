package dealed.easy;

public class _14最长公共前缀 {
    // 纵向遍历
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        out:for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for(String str: strs) {
                if (str.length() == i || str.charAt(i) != c) break out;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    // 横向遍历
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        int count = strs.length;
        for(int i = 1; i<count;i++) {
            prefix = longestCommonPrefix(prefix,strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while(index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
}
