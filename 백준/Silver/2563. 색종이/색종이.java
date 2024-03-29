import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[101][101];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a; j < a+10; j++) {
                for (int k = b; k < b+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        int sum = Arrays.stream(arr).flatMapToInt(Arrays::stream).sum();
        System.out.println(sum);
    }
}