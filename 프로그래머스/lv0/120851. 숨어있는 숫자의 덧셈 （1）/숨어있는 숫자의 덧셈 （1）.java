import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.replaceAll("[A-z]","").split("");
       return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
        
    }
}