class Solution {
    public double solution(int[] arr) {
         int answer = 0;
        
        for(int num : arr){
            answer += num;
        }
        
        return (double) answer / arr.length;
    }
}