import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dial = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7 ,7, 7, 8, 8, 8, 9, 9, 9, 9};
        char[] charArray = br.readLine().toCharArray();

        int sum = 0;

        for (int i = 0; i < charArray.length; i++) {
            int index = charArray[i] - 65;
            int time = dial[index] + 1;
            sum += time;
        }

        System.out.println(sum);
    }
}
