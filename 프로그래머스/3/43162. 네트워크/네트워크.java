class Solution {
    int n;
    int[][] computers;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }
        
        return cnt;
    }
    
    private void dfs(int i) {
        visited[i] = true;

        for (int j = 0; j < n; j++) {
            if (!visited[j] && computers[i][j] == 1) {
                dfs(j);
            }
        }
    }
}