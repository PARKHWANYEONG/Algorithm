class Solution {
    public int solution(int n) {
        String bn = Integer.toBinaryString(n);
        int cnt = 0;
        for(char ch : bn.toCharArray()){
            if(ch == '1') cnt++;
        }
        
        int pos = n+1;
        while(true){
            int count = 0;
            String cur = Integer.toBinaryString(pos);
            for(char ch: cur.toCharArray()){
                if(ch == '1'){
                    count++;
                }
            }
            if(cnt == count) return pos;
            pos++;
        }
    }
}