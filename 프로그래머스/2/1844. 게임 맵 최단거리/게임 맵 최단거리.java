import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int n = maps[0].length;
        int m = maps.length;
        int[][] directions = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            int distance = current[2];

            if (y == m - 1 && x == n - 1) {
                return distance;
            }

            for (int[] direction : directions) {
                int ny = y + direction[0];
                int nx = x + direction[1];

                if (ny >= 0 && nx >= 00 && ny < m && nx < n && maps[ny][nx] == 1) {
                    maps[ny][nx] = 0;
                    queue.offer(new int[]{ny,nx,distance+1});
                }
            }
        }

        return -1;
    }
}