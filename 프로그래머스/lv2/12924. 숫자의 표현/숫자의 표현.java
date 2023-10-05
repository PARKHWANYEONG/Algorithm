class Solution {
    public int solution(int n) {
        
        int count = 0;
        int sum = 0;
        
        int start = 0;
        int end = 0;
        
        while(start <= end){
            if(sum == n){
                count++;
                end++;
                sum += end;
            }else if(sum < n){
                end++;
                sum += end;
            }else{
                sum -= start;
                start++;
            }
        }
        return count;
    }
}