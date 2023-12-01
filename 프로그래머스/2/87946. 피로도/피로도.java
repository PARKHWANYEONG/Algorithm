import java.util.Arrays;

class Solution {
    
    int answer = 0;
    boolean[] visited;
    int[][] dungeon;

    public int solution(int k, int[][] dungeons) {

        visited = new boolean[dungeons.length];
        Arrays.fill(visited, false);
        dungeon = dungeons;

        dfs(k, 0);
        
        return answer;
    }

    private void dfs(int k, int count) {
        for (int i = 0; i <dungeon.length; i++) {
            if (!visited[i] && dungeon[i][0] <= k) {
                visited[i] = true;
                dfs(k-dungeon[i][1],count+1);
                visited[i] = false;
            }
        }
        answer = Math.max(count, answer);
    }
}