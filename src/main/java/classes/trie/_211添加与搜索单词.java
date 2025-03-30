package classes.trie;

public class _211添加与搜索单词 {

    class Node {
        boolean end = false;
        Node[] nodes = new Node[26];
    }

    Node root = new Node();
    public void addWord(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if (cur.nodes[c] == null) {
                cur.nodes[c] = new Node();
            }
            cur = cur.nodes[c];
        }
        cur.end = true;
    }

    public boolean search(String word) {
        return dfs(0, word, root);
    }

//    private boolean dfs(int idx, String word, Node root) {
//        if (root == null) return false;
//        if (idx == word.length()) return root.end;
//
//        int c = word.charAt(idx);
//        if (c == '.') {
//            for (int i = 0; i < 26; i++) {
//                Node node = root.nodes[i];
//                if (node == null) {
//                    continue;
//                }
//                if (dfs(idx + 1, word, node)){
//                    return true;
//                }
//            }
//            return false;
//        } else {
//            c = c - 'a';
//            Node node = root.nodes[c];
//            if (node == null) return false;
//            return dfs(idx + 1, word, node);
//        }
//    }

    // 简化一下dfs
    private boolean dfs(int idx, String word, Node root) {
        if (root == null) return false;
        if (idx == word.length() ) return root.end;

        if (word.charAt(idx) == '.') {
            for (int i = 0; i < 26; i++) {
                if (dfs(idx +1, word, root.nodes[i])) {
                    return true;
                }
            }
            return false;
        } else {
            int c = word.charAt(idx) - 'a';
            return dfs(idx + 1, word, root.nodes[c]);
        }
    }
}
