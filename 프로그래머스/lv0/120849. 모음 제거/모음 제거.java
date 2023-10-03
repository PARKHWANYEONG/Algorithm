class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] split = my_string.split("");

        for (String str: split) {
            if(!(str.equals("a") || str.equals("e") || str.equals("o") || str.equals("u") || str.equals("i"))){
                answer += str;
            }
        }
        return answer;
    }
}