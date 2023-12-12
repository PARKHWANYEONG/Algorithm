import java.io.*;
import java.util.Arrays;

public class Main {

    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] ints = new int[N];

        for (int i = 0; i < N; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }

        Arrays.stream(ints).sorted().forEach(n-> {
            try {
                bw.write(n+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.flush();
    }
}