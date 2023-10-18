import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        int current = 0;
        while (current < progresses.length) {
            int count = 0;
            if (progresses[current] < 100) {
                for (int i = current; i < progresses.length; i++) {
                    progresses[i] += speeds[i];
                }
            }
            if (100 <= progresses[current]) {
                for (int i = current; i < progresses.length; i++) {
                    if (progresses[i] < 100) {
                        break;
                    }
                    count++;
                }
            }
            if(count != 0){
                answerList.add(count);
            }
            current += count;
        }

        return answerList.stream().mapToInt(i -> i.intValue()).toArray();
    }
}