class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = new String(n + "");
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            answer += Integer.parseInt(split[i]);
        }
        return answer;
    }
}