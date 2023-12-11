import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] arr;
    static int[] temp;
    static boolean[] isUsed;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        isUsed = new boolean[N];
        arr = new int[M];
        temp = new int[N];

        for (int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(temp);

        bt(0);
        bw.flush();
    }

    private static void bt(int cnt) throws IOException {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                bw.write(arr[i]+" ");
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isUsed[i]) {
                arr[cnt] = temp[i];
                isUsed[i] = true;
                bt(cnt + 1);
                isUsed[i] = false;
            }
        }
    }
}