class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while(temp != 0){
            int temp2 = temp%10;
            sum += temp2;
            temp /=10;
        }
        
        if(x % sum == 0){
            return true;
        }
        return false;
    }
}