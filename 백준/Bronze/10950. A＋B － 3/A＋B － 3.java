import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());

            arr[i] = b+c;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}