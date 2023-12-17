import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int start = 0 ;
        int end = people.length-1;
        int answer = 0;

        while (start <= end) {
            int max = people[end];
            int min = people[start];

            if (max + min <= limit) {
                answer++;
                start++;
                end--;
            } else {
                answer++;
                end--;
            }
        }
        
        return answer;
    }
}