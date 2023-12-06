import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int star = i * 2 + 1;
            int brank = ((2 * N - 1) - star) / 2;
            String str = " ".repeat(brank) + "*".repeat(star);
            System.out.println(str);
        }

        for (int i = N-2; i >= 0; i--) {
            int star = i * 2 + 1;
            int brank = ((2 * N - 1) - star) / 2;
            String str = " ".repeat(brank) + "*".repeat(star);
            System.out.println(str);
        }
    }
}