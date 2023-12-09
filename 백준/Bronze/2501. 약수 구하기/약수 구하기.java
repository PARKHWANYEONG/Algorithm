import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = 0;
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                answer = i;
                count++;
                if (count == K) {
                    break;
                }
            }
        }
        if (count < K) {
            answer = 0;
        }
        System.out.println(answer);
    }
}