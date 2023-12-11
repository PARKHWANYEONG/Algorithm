import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] used;
    static int[] arr;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        used = new boolean[N + 1];
        arr = new int[M];

        bt(0);
    }

    private static void bt(int C) {
        if (C == M) {
            StringBuilder sb = new StringBuilder();
            for (int n : arr) {
                sb.append(n + " ");
            }
            System.out.println(sb);
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!used[i]) {
                arr[C] = i;
                used[i] = true;
                bt(C+1);
                used[i] = false;
            }
        }
    }
}