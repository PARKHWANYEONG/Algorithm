import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = Arrays.stream(photo)
                .mapToInt(p -> Arrays.stream(p).mapToInt(n-> map.getOrDefault(n,0)).sum())
                .toArray();
        
        return answer;
    }
}