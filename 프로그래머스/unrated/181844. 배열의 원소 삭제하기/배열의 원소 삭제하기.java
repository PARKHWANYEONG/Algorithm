import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        
        return Arrays.stream(arr).filter(v-> !list.contains(v)).toArray();
    }
}