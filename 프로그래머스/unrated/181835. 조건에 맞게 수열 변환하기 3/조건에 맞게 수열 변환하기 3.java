import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        return IntStream.of(arr).map(v -> {
            if (k % 2 == 1) {
                return v * k;
            }
            return v + k;
        }).toArray();
    }
}