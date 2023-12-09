import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int s = 2;

        while (N > 1) {
            if (N % s == 0) {
                System.out.println(s);
                N /= s;
            } else {
                s++;
            }
        }
    }
}