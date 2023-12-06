import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (arr[j] == null) {
                    arr[j] = String.valueOf(str.charAt(j));
                } else {
                    arr[j] += String.valueOf(str.charAt(j));
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        Arrays.stream(arr)
                .filter(v -> v != null)
                .forEach(sb::append);
        System.out.println(sb);
    }
}