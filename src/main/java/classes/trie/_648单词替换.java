package classes.trie;

import java.util.List;

public class _648单词替换 {
    class Node{
        boolean end = false;
        Node[] nodes = new Node[26];
    }

    Node root = new Node();
    public String replaceWords(List<String> dictionary, String sentence) {
        for (int i = 0; i < dictionary.size(); i++) {
            insert(dictionary.get(i));
        }
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            s[i] = search(s[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
            if (i != s.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String search(String s) {
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            Node node = cur.nodes[c];
            if (node == null) {
                return s;
            } else if (node.end) {
                return s.substring(0, i + 1);
            } else {
                cur = node;
            }
        }
        return s;
    }

    private void insert(String s) {
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (cur.nodes[c] == null) {
                cur.nodes[c] = new Node();
            }
            if (cur.nodes[c].end) return;
            cur = cur.nodes[c];
        }
        cur.end = true;
    }


}
