package dealed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _6Z字形变换 {


    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        if (numRows == 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i+=2) {
                sb.append(s.charAt(i));
            }
            for (int i = 1; i < s.length(); i+=2) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }

        char[][] map = new char[numRows][s.length() / (numRows * 2 - 2) * 2 + 2];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], '0');
        }

        boolean down = true;
        int r = 0, c = 0, i = 0;
        while (i < s.length()) {
            System.out.println("R " + r + " C " + c) ;
            map[r][c] = s.charAt(i);
            if (down) {
                if (r == numRows - 1) {
                    down = false;
                    r --;
                    c ++;
                } else {
                    r ++;
                }
            } else {
                if (r == 1) {
                    down = true;
                    r = 0;
                    c ++;
                } else {
                    r --;
                }
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < map.length; j++) {
            for (int k = 0; k < map[0].length; k++) {
                if (map[j][k] != '0') {
                    sb.append(map[j][k]);
                }
            }
        }
        return sb.toString();
    }

    public String convert1(String s, int numRows) {
        if(numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for(int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for(char c : s.toCharArray()) {
            rows.get(i).append(c);
            if(i == 0 || i == numRows -1) flag = - flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) res.append(row);
        return res.toString();
    }

}
