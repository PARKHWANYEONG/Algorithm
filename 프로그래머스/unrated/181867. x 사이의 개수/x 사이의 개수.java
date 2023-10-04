import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x",-1);
        return Arrays.stream(arr).mapToInt(v->v.length()).toArray();
    }
}