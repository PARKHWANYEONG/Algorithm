import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Integer[] citationsInteger = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        
        Arrays.sort(citationsInteger, Collections.reverseOrder());
        
        for (int i = 0; i < citationsInteger.length; i++) {
            if (citationsInteger[i] > i) {
                answer++;
            }
        }
            
        return answer;
    }
}