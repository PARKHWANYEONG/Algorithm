import java.util.ArrayList;
import java.util.List;

class Solution {

    String[] words = {"A", "E", "I", "O", "U"};
    List<String> index = new ArrayList<>();

    public int solution(String word) {
        dfs("");

        return index.indexOf(word);
    }

    private void dfs(String str) {
        if (str.length() > 5) {
            return;
        }
        
        index.add(str);
        
        for (int i = 0; i < words.length ; i++) {
            dfs(str+words[i]);
        }
    }
}