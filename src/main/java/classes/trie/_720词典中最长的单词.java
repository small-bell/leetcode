package classes.trie;

public class _720词典中最长的单词 {

    public String longestWord(String[] words) {
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        dfs(root, 0, new StringBuilder());
        return ans;
    }
    class Node {
        boolean end = false;
        Node[] nodes = new Node[26];
    }

    Node root = new Node();

    void insert(String val) {
        Node  cur = root;
        for (int i = 0; i < val.length(); i++) {
            int idx = val.charAt(i) - 'a';
            Node node = cur.nodes[idx];
            if (node == null) {
                cur.nodes[idx] = new Node();
            }
            cur = cur.nodes[idx];
        }
        cur.end = true;
    }

    int res = 0;
    String ans = "";

    private void dfs(Node root, int i, StringBuilder sb) {
        if (root.end && i > res) {
            res = i;
            ans = sb.toString();
        }

        for (int j = 0; j < 26; j++) {
            if (root.nodes[j] == null) {
                continue;
            }
            if (!root.nodes[j].end ) {
                continue;
            }
            sb.append((char)('a' + j));
            dfs(root.nodes[j], i + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


}
