import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedWriter bw;
    static int N;
    static int M;
    static int[] numbers;
    static int[] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        temp = new int[M];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(numbers);

        dfs(0);

        bw.flush();
    }

    private static void dfs(int cnt) throws IOException {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                bw.write(temp[i]+" ");
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < N; i++) {
            temp[cnt] = numbers[i];
            dfs(cnt+1);
        }
    }
}