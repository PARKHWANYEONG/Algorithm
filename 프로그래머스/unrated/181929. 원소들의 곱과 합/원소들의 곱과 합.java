import java.util.*;


class Solution {
    public int solution(int[] num_list) {
        int multi = Arrays.stream(num_list).reduce(1,(a,b)-> a*b);
        int sum = Arrays.stream(num_list).sum();
        
        return multi < Math.pow(sum,2) ? 1 : 0;
    }
}