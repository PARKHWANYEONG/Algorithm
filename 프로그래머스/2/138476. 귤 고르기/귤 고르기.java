import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        int[] array = map.values().stream().sorted().mapToInt(Integer::intValue)
                .toArray();
        
        for (int i = array.length - 1; i >= 0 ; i--) {
            k -= array[i];
            answer++;
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}