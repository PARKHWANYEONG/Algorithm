class Solution {
    public String solution(int n) {
        String answer = "수박".repeat((int) Math.ceil((double) n / 2));

        if(n%2 == 1){
            return answer.substring(0,answer.length()-1);
        }
        return answer;
    }
}