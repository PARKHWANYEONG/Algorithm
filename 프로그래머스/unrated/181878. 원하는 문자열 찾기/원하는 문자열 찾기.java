class Solution {
    public int solution(String myString, String pat) {
        String str = myString.toLowerCase();
        String patStr = pat.toLowerCase();
        
        return str.indexOf(patStr) == -1 ? 0 : 1;
    }
}