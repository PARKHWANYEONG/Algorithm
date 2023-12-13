import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 2; i <= N; i++) {
            int sum = Arrays.stream(Integer.toString(i).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();

            if (sum + i == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}