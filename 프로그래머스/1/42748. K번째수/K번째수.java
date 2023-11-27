import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands)
            .mapToInt(a -> Arrays.stream(Arrays.copyOfRange(array, a[0]-1, a[1]))
                      .sorted()
                      .toArray()[a[2] - 1])
                .toArray();
    }
}