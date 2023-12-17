class Solution {
    
    int[] arr;
    
    public int solution(int[] arr) {
        this.arr = arr;
        int answer = findLCM();
        return answer;
    }
    
    private int findLCM() {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = calculateLCM(lcm, arr[i]);
        }
        return lcm;
    }

    // 최대 공약수 계산 함수
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소 공배수 계산 함수
    private int calculateLCM(int a, int b) {
        return a * b / gcd(a, b);
    }
}