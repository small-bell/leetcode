package pre;

import java.util.ArrayList;
import java.util.List;

public class _6Z字形变换 {


    public String convert(String s, int numRows) {
        if(numRows < 2) return s;
        List<StringBuilder> sbs = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            sbs.add(new StringBuilder());
        }
        
        int idx = 0, flag = -1;
        for (int i = 0; i < s.length(); i++) {
            sbs.get(idx).append(s.charAt(i));
            if (idx == numRows - 1 || idx == 0) flag = - flag;
            idx += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : sbs) res.append(row);
        return res.toString();
    }

    public static void main(String[] args) {
        String paypalishiring = new _6Z字形变换().convert("PAYPALISHIRING", 4);
        System.out.println(paypalishiring);
    }

    public static class _37解数独 {
    }
}
