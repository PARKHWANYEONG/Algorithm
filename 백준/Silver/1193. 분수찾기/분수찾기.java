import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int A = 1;
        while (X > A) {
            X -= A;
            A++;
        }
        int a, b;

        if (A % 2 == 0) {
            a = X ; b = A - X + 1;
        } else {
            a = A - X + 1; b = X;
        }
        System.out.println(a+"/"+b);
    }
}