package classes.trie;

public class _677键值映射 {

    class Node {
        boolean end = false;
        Node[] nodes = new Node[26];
        int val = 0;
    }
    Node root = new Node();

    public void insert(String word, int val) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.nodes[c - 'a'] == null) {
                Node node = new Node();
                cur.nodes[c - 'a'] = node;
            }
            cur = cur.nodes[c - 'a'];
        }
        cur.val = val;
    }

    public int sum(String prefix) {
        Node cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            int c = prefix.charAt(i) - 'a';
            if (cur.nodes[c] == null) return 0;
            cur = cur.nodes[c];
        }
        return dfs(cur);
    }

    private int dfs(Node cur) {
        if (cur == null) return 0;
        int ans = cur.val;
        for (int i = 0; i < 26; i++) {
            ans += dfs(cur.nodes[i]);
        }
        return ans;
    }
}
