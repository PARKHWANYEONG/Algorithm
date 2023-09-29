import java.util.*;

class Solution {
    public long solution(long n) {
        String numStr = n + "";  // "118372"
        String[] numStrArr = numStr.split(""); // ["1","1","8"....]
        Arrays.sort(numStrArr,Comparator.reverseOrder());
        String result = String.join("",numStrArr);
        
        return Long.valueOf(result);
    }
}