class Solution {
    public int[] solution(int n, int m) {
        int min = n*m;
        int max = 1;
        
        for(int i=1; i<= n*m; i++){
            if((n % i == 0 && m % i == 0)&& max < i){
                max = i;
            }
            if((i % n == 0 && i % m == 0)&& min > i){
                min = i;
            }
        }
        return new int[]{max,min};
    }
}