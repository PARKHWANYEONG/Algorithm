class Solution {
    public int[][] solution(int[][] arr) {
        int width = arr.length;
        int height = arr[0].length;
        int max = Math.max(width,height);
        int[][] answer = new int[max][max];
        
        if(width < height){
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }else {
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}