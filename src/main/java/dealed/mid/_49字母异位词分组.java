package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _49字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] cs = new char[27];
            for (int j = 0; j < strs[i].length(); j++) {
                cs[strs[i].charAt(j) - 'a'] ++;
            }
            String s = new String(cs);
            List<String> lst = map.getOrDefault(s, new ArrayList<>());
            lst.add(strs[i]);
            map.put(s, lst);
        }
        return new ArrayList<>(map.values()) ;
    }
}
