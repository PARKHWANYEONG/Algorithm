import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).filter(v-> v==n).toArray().length == 0 ? 0 : 1;
    }
}