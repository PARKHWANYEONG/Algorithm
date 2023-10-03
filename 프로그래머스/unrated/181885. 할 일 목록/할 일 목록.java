import java.util.stream.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0,todo_list.length).mapToObj(i-> finished[i] ? "X" : todo_list[i]).filter(v-> !v.equals("X")).toArray(String[]::new);
    }
}