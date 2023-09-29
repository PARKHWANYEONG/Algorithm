class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        String str = s.toLowerCase();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'p'){
                p++;
            }
            if(ch == 'y'){
                y++;
            }
        }
        
        return p == y ? true : false;
    }
}