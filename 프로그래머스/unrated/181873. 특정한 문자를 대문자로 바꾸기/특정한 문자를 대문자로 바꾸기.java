class Solution {
    public String solution(String my_string, String alp) {
        String[] str = my_string.split("");
        
        for(int i=0; i<str.length; i++){
            if(str[i].equals(alp)){
                str[i] = alp.toUpperCase();
            }
        }
        
        return String.join("",str);
    }
}