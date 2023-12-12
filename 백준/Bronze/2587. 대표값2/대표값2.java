import java.io.*;
import java.util.Arrays;

public class Main {

    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ints = new int[5];

        for (int i = 0; i < 5; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }
        int center = Arrays.stream(ints).sorted().toArray()[2];
        int average = (int) Arrays.stream(ints).average().getAsDouble();

        System.out.printf("%d\n%d",average,center);
    }
}