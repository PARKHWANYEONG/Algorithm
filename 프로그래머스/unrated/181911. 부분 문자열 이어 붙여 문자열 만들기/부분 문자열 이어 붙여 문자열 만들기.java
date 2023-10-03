import java.util.stream.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        return String.join("",IntStream.range(0,parts.length).mapToObj(i-> my_strings[i].substring(parts[i][0],parts[i][1]+1))
            .toArray(String[]::new));
    }
}