import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        HashMap<String, Boolean> map = new HashMap<>();

        int index = 0;

        map.put(words[0], true);

        for (int i = 1; i < words.length; i++) {
            String pre = words[i - 1];
            String cur = words[i];
            char first = cur.charAt(0);
            char last = pre.charAt(pre.length() - 1);

            if (map.containsKey(cur) ||  last != first) {
                index = i;
                break;
            } else {
                map.put(cur, true);
            }
        }
        
        if (index == 0) {
            return new int[]{0,0};
        }
        return new int[]{(index)%n + 1,(int)Math.ceil(((double)index+1)/n)};
    }
}