import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int max1 = 0;
        int max2 = 0;
        for (int[] size : sizes) {
            Arrays.sort(size);
            if (size[0] > max1) {
                max1 = size[0];
            }
            if (size[1] > max2) {
                max2 = size[1];
            }
        }
        return max1 * max2;
    }
}