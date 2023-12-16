import java.util.*;

class Solution {
    public int solution(String s) {
        List<String> list = 
            new ArrayList<>(List.of("zero","one","two","three","four","five","six","seven","eight","nine"));

        String answer = "";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                temp += c;
            } else {
                answer += c;
            }

            int index = list.indexOf(temp);
            if (index != -1) {
                answer += index;
                temp = "";
            }
        }
        
        return Integer.parseInt(answer);
    }
}