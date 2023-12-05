import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = IntStream.rangeClosed(1, N).toArray();

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());

            for (int j = I - 1,k = J - 1; j < k; j++,k--) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}