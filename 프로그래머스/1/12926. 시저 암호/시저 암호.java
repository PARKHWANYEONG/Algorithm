import java.util.*;

class Solution {
    public String solution(String s, int n) {
        
        String answer = "";
        int leng = s.length();
        
        for(int i=0; i<leng; i++){
            char ch = s.charAt(i);
            
            if(Character.isWhitespace(ch)){
                answer += " ";
                continue;
            }
            
            char base = Character.isUpperCase(ch) ? 'A' : 'a';
            
            int cur = (ch - base + n)%26 + base;
            
            answer += (char)cur;
        }
        
        return answer;
    }
}