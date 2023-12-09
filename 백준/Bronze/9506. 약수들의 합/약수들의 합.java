import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String format = "%d is NOT perfect.\n";

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            String[] arr = getArr(n);
            int sum = getSum(arr);
            if (sum == n) {
                System.out.println(n+" = " + String.join(" + ",arr));
            } else {
                System.out.printf(format,n);
            }
        }
    }

    private static int getSum(String[] arr) {
        return Arrays.stream(arr).mapToInt(Integer::valueOf).sum();
    }

    private static String[] getArr(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                list.add(String.valueOf(i));
            }
        }
        return list.stream().toArray(String[]::new);
    }
}