import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            String[] array = Arrays.stream(str.split("")).map(s -> s.repeat(R)).toArray(String[]::new);
            String join = String.join("", array);
            sb.append(join+"\n");
        }

        System.out.println(sb);
    }
}