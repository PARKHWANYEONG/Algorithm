import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br;
    static BufferedWriter bw;
    static int N;
    static int max;
    static int min;
    static int[] numbers;
    static int[] operator;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        operator = new int[4];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st1.nextToken());
        }
        dfs(1, 0, numbers[0]);

        System.out.println(max);
        System.out.println(min);

    }

    private static void dfs(int index, int count, int sum) {
        if (count == N - 1) {
            if (max < sum) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if(operator[i] == 0) continue;

            if (i == 0) {
                operator[i] -= 1;
                dfs(index + 1, count + 1, sum + numbers[index]);
                operator[i] += 1;
            } else if (i == 1) {
                operator[i] -= 1;
                dfs(index + 1, count + 1, sum - numbers[index]);
                operator[i] += 1;
            } else if (i == 2) {
                operator[i] -= 1;
                dfs(index + 1, count + 1, sum * numbers[index]);
                operator[i] += 1;
            } else {
                operator[i] -= 1;
                dfs(index + 1, count + 1, sum / numbers[index]);
                operator[i] += 1;
            }
        }
    }
}