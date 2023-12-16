

class Solution {
    
    static int answer = 0;
    static int[] number;
    
    public int solution(int[] number) {
        
        this.number = number;
        
        dfs(0,0,0);
        
        return answer;
    }
    
    private static void dfs(int index, int depth, int sum) {
        if (depth == 3) {
            if (sum == 0) {
                answer++;
            }
            return;
        }

        for (int i = index; i < number.length; i++) {
            dfs(i+1,depth + 1, sum + number[i]);
        }
    }
}