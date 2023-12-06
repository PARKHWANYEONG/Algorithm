import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;

        for (int i = 0; i < 2; i++) {
            String[] arr = reverse(st.nextToken().split(""));
            int num = concatAndParseToInt(arr);
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }

    private static int concatAndParseToInt(String[] arr) {
        return Integer.parseInt(String.join("", arr));
    }

    private static String[] reverse(String[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}