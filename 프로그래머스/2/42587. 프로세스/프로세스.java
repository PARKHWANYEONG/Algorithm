import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> ps = new PriorityQueue<>(Comparator.reverseOrder());

        for (int priority : priorities) {
            ps.add(priority);
        }

        System.out.println("ps = " + ps);

        while (!ps.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == ps.peek()) {
                    ps.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}