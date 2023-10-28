class Solution {
    public int solution(int n, int k) {
        String convert = "";

        while (n > 0) {
            convert = n % k + convert;
            n/=k;
        }
        String[] split = convert.toString().split("0+");
        
        int count = 0;

        for (String num : split) {
            if (isPrime(Long.parseLong(num))) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(Long num) {
        if(num == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}