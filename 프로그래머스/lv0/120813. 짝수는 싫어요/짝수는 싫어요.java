import java.util.stream.*;
class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1,n).filter(v-> v%2 == 1).toArray();
    }
}