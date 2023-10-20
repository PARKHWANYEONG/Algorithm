import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int num : d){
            if(budget-num >= 0){
                budget -= num;
                answer++;
            }
        }
        return answer;
    }
}