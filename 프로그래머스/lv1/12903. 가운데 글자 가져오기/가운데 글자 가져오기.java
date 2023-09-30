class Solution {
    public String solution(String s) {
        String answer;
        int length = s.length();
        if(length % 2 == 1){
            answer = String.valueOf(s.charAt(length/2));
        }else {
            answer = s.substring((length/2)-1,(length/2)+1);
        }
        
        return answer;
    }
}