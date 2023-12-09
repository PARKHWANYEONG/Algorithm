import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 거리
        int B = Integer.parseInt(st.nextToken()); // 밤에 내려가는 거리
        int V = Integer.parseInt(st.nextToken()); // 나무 막대의 높이

        int D = A - B;
        int day = (int)Math.ceil((double)(V - A)/ D) + 1;
        System.out.println(day);
    }
}