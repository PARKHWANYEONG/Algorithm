import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String str = Arrays.stream(br.readLine().split(""))
                .sorted().collect(Collectors.joining());

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());
    }
}