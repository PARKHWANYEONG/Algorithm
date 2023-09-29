class Solution {
    public long solution(long n) {
        
        int squareRoot = (int)Math.sqrt(n);
        
        for(int i=1; i<= squareRoot; i++){
            if((long)i*i == n){
                return ((long)i+1)*(i+1);
            }
        }
        return -1;
    }
}