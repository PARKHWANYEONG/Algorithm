import java.util.stream.*;

class Solution {
    public int solution(int n) {
        if(n % 2 == 1){
            return IntStream.rangeClosed(1,n).filter(v->v%2 == 1).sum();
        }
        return IntStream.rangeClosed(1,n).filter(v->v%2 == 0).map(v-> v*v).sum();
    }
}