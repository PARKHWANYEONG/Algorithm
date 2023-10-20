class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        boolean isToUpperCase = true;
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                sb.append(ch);
                isToUpperCase = true;
                continue;
            }
            if(isToUpperCase){
                sb.append(Character.toUpperCase(ch));
                isToUpperCase = false;
            }else{
                sb.append(ch);
                isToUpperCase = true;
            }
        }
        return sb.toString();
    }
}