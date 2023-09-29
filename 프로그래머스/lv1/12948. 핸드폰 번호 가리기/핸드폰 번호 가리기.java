class Solution {
    public String solution(String phone_number) {
        
        String substring = phone_number.substring(phone_number.length() - 4);
        String repeat = "*".repeat(phone_number.length() - 4);
        
        return repeat+substring;
    }
}