class Solution {
    public int solution(int a, int b, int n) {
         int answer = 0;

        while (n >= a) {
            int bonus = (n / a) * b;
            n %= a;
            answer += bonus;
            n += bonus;
        }
        return answer;
    }
}