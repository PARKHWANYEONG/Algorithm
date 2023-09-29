import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
    
       ArrayList<Integer> list = new ArrayList<>();
       
       while(n != 0){
          int temp =(int)(n%10);
          list.add(temp);
          n /= 10;
       }
     
       int[] answer = new int[list.size()];
       
        IntStream.range(0,answer.length).forEach(i->{
            answer[i] = list.get(i);
        });
            
            return answer;
        
    }
}