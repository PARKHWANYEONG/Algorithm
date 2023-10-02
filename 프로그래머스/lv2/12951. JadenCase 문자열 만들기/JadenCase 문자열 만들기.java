class Solution {
    public String solution(String s) {
        String str = s.toLowerCase();
        boolean first = true;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                first = true;
                continue;
            }
            if(first){
                sb.append(String.valueOf(str.charAt(i)).toUpperCase());
            }else{
                sb.append(str.charAt(i));
            }
            first = false;
        }
        
        return sb.toString();
    }
}