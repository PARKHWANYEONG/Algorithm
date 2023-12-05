import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] array = IntStream.rangeClosed(97, 122)
                .mapToObj(i -> String.valueOf(str.indexOf(i)))
                .toArray(String[]::new);

        System.out.println(String.join(" ",array));
    }
}