import java.util.*;

class Solution {
    boolean solution(String s) {
        int answer = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '('){
                answer++;
            }else{
                answer--;
            }
            if(answer < 0) return false;
        }
        return answer == 0 ? true : false;
    }
}