class Solution {
    public int solution(int[][] triangle) {
        int[][] answer = triangle;
        
        answer[1][0] = triangle[0][0] + answer[1][0]; 
        answer[1][1] = triangle[0][0] + answer[1][1]; 
        
        for(int i=2; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                if(j == 0){
                    answer[i][j] = answer[i][j] + answer[i-1][j];
                }else if(j == triangle[i].length-1){
                    answer[i][j] = answer[i][j] + answer[i-1][answer[i-1].length-1];
                }else{
                    answer[i][j] = Math.max(answer[i-1][j-1],answer[i-1][j]) + answer[i][j];
                }
            }
        }
        
        int result = 0;
        
        for(int i=0; i<answer[triangle.length-1].length; i++){
            result = Math.max(result,answer[triangle.length-1][i]);
        }
        
        
        return result;
    }
}