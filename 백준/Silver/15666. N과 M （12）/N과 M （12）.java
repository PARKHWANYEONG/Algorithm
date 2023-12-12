import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static BufferedReader br;
    static BufferedWriter bw;
    static int[] numbers;
    static LinkedHashSet<String> set;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());  // 4
        M = Integer.parseInt(st.nextToken());  // 2

        numbers = new int[N];
        set = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(numbers);

        dfs(0,0,"");

        for (String str : set) {
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
    }

    private static void dfs(int start, int count, String str) throws IOException {
        if (count == M) {
            set.add(str);
            return;
        }

        for (int i = start; i < N; i++) {
            dfs(i,count+1,str+numbers[i]+" ");
        }
    }
}