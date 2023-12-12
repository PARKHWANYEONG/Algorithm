import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static BufferedWriter bw;
    static int N,M;
    static int[] numbers;
    static boolean[] isUsed;
    static LinkedHashSet<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        isUsed = new boolean[N];
        set = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(numbers);

        dfs(0,"");

        for (String str : set) {
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
    }

    private static void dfs(int cnt,String str) throws IOException {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                set.add(str);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            dfs(cnt+1,str+numbers[i]+" ");
        }
    }
}