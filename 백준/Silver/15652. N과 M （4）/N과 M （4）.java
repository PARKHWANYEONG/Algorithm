import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] arr;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        bt(1,0);
        bw.flush();
    }

    private static void bt(int start ,int cnt) throws IOException {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                bw.write(arr[i]+" ");
            }
            bw.newLine();
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[cnt] = i;
            bt(i,cnt + 1);
        }
    }
}