import java.util.Arrays;

public class Test {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        for(int i = 0; i <= n - 1; ++i) {
            int num = nums2[i];// 3

            for(int j = p; j >= 0; j --) {//j=4
                if(num < nums1[j]) {// 6
                    nums1[j + 1] = nums1[j];
                } else {
                    nums1[j + 1] = num;
                    p++;
                    break;
                }
            }

        }



    }

    public static void main () {

    }

}
