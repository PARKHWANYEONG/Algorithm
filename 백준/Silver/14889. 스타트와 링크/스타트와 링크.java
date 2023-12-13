import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static boolean[] isVisited;
    static int N;
    static int diff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        isVisited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(diff);
    }

    static void dfs(int index, int depth) {
        if (depth == N / 2) {
            cal();
            return;
        }

        for (int i = index; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                dfs(i + 1, depth + 1);
                isVisited[i] = false;
            }
        }
    }

    static void cal() {
        int teamA = 0;
        int teamB = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isVisited[i] && isVisited[j]) {
                    teamA += arr[i][j];
                    teamA += arr[j][i];
                }
                if (!isVisited[i] && !isVisited[j]) {
                    teamB += arr[i][j];
                    teamB += arr[j][i];
                }
            }
        }
        int dif = Math.abs(teamA - teamB);
        if (dif == 0) {
            System.out.println(dif);
            System.exit(0);
        }
        diff = Math.min(dif, diff);
    }
}