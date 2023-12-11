import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sb = new StringBuilder();
        count = 0;

        recur(1, 3, N);

        System.out.println(count);
        System.out.println(sb);
    }

    private static void recur(int a, int b, int N) {
        // base
        if (N == 0) {
            return;
        }
        count++;
        recur(a,6-a-b,N-1);
        sb.append(a + " " + b + "\n");
        recur(6-a-b,b,N-1);
    }
}