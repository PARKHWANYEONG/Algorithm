class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char ch : my_string.toCharArray()){
            if(ch < 97){
                answer += String.valueOf(ch).toLowerCase();
            }else{
                answer += String.valueOf(ch).toUpperCase();
            }
        }
        
        return answer;
    }
}