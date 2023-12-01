import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int[] firstAnswers = {1,2,3,4,5};
        int[] secondAnswers = {2,1,2,3,2,4,2,5};
        int[] thirdAnswers = {3,3,1,1,2,2,4,4,5,5};


        int first = (int) IntStream.range(0, answers.length).filter(i -> firstAnswers[i % firstAnswers.length] == answers[i]).count();
        int second = (int) IntStream.range(0, answers.length).filter(i -> secondAnswers[i % secondAnswers.length] == answers[i]).count();
        int third = (int) IntStream.range(0, answers.length).filter(i -> thirdAnswers[i % thirdAnswers.length] == answers[i]).count();

        int max = Math.max(first, Math.max(second, third));

        if (max == first) {
            answer.add(1);
        }
        
        if (max == second) {
            answer.add(2);
        }
        
        if (max == third) {
            answer.add(3);
        }

        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}