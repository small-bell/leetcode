package classes.trie;

public class _14最长公共前缀 {
    // 这题有点牵强的

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].equals("")) return "";

        int i = 0;
        StringBuilder sb = new StringBuilder("");
        while (true) {
            if (i == strs[0].length()) return sb.toString();
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) return sb.toString();
            }
            sb.append(c);
            i ++;
        }
    }
}
