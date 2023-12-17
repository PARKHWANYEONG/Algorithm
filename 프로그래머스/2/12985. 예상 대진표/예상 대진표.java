class Solution
{
    public int solution(int n, int a, int b)
    {
        int cnt = 0;
        while (true) {
            cnt ++;
            int A = (int) Math.ceil((double) a / 2);
            int B = (int) Math.ceil((double) b / 2);
            if (A == B) {
                return cnt;
            }
            a = A;
            b = B;
        }
    }
}