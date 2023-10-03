import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");
        return Arrays.stream(str).filter(v -> !v.isEmpty()).toArray(String[]::new);
        
    }
}
