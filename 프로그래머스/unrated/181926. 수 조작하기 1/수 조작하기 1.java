class Solution {
    public int solution(int n, String control) {
        
        for(int i=0; i<control.length(); i++){
            char cur = control.charAt(i);
            if(cur == 'w') n++;
            if(cur == 's') n--;
            if(cur == 'd') n+=10;
            if(cur == 'a') n-=10;
        }
        
        return n;
    }
}