import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int count = recur(N, r, c);

        System.out.println(count);
    }

    private static int recur(int n, int r, int c) {
        if(n == 0 ) return 0;

        int half = (int)Math.pow(2, (n - 1));
        if(r < half && c < half) return recur(n - 1, r, c);
        if(r < half && c >= half) return half * half + recur(n-1,r,c - half);
        if(r >= half && c < half) return 2 * half * half + recur(n - 1, r - half, c);
        return 3 * half * half + recur(n - 1, r - half, c - half);
    }
}