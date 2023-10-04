import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        return my_string.chars().filter(ch-> ch <= 57).map(v-> v-48).sorted().toArray();
    }
}