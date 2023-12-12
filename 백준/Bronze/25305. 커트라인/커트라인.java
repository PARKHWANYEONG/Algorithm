import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] ints = new int[N];

        for (int i = 0; i < N; i++) {
            ints[i] = Integer.parseInt(st1.nextToken());
        }

        int[] sorted = Arrays.stream(ints).sorted().toArray();

        for (int i = N-1; i >= 0 ; i--) {
            k--;
            if (k == 0) {
                System.out.println(sorted[i]);
            }
        }
    }
}