import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] maps) {
        int n = maps[0].length; //5
        int m = maps.length; // 5
        int[][] move = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int answer = 1;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        maps[0][0] = 0;

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int[] coor = queue.poll();

                int y = coor[0];
                int x = coor[1];

                for (int j = 0; j < move.length; j++) {
                    int mx = x + move[j][0];  // 1 -1  0  0
                    int my = y + move[j][1];  // 0  0  1 -1

                    if (mx >= 0 && mx < n && my >= 0 && my < m && maps[my][mx] == 1) {
                        if (mx == n - 1 && my == m - 1) {
                            return ++answer;
                        }
                        queue.offer(new int[]{my, mx});
                        maps[my][mx] = 0;
                    }
                }
            }
            answer++;
        }

        return -1;
    }
}