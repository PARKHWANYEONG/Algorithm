class Solution {
    public int solution(int n, int k) {
        
        String[] split = Integer.toString(n,k).split("0+");

        int answer = 0;
        
        for(String str : split){
            if(check(Long.parseLong(str))) answer++;
        }
        
        return answer;
    }
    
    public boolean check(Long num){
        if(num == 1) return false;
        for(int i=2; i <= (int) Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    
}