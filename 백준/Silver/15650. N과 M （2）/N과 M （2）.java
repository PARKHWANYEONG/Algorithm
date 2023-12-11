import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        bt(1,0);
    }

    private static void bt(int start ,int c) {
        if (c == M) {
            Arrays.stream(arr).forEach(n-> System.out.print(n+" "));
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[c] = i;
            bt(i+1,c+1);
        }
    }
}