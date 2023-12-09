import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0) {
                break;
            }
            int max = Math.max(a, Math.max(b, c));
            if (a == b && b == c ) {
                System.out.println("Equilateral");
            } else if (max >= (a+b+c - max)) {
                System.out.println("Invalid");
            } else if (a != b && b != c && a != c) {
                System.out.println("Scalene ");
            } else {
                System.out.println("Isosceles");
            }
        }
    }
}