import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int[] answer = Arrays.copyOf(num_list,leng+1);
        if(num_list[leng-1] > num_list[leng-2]){
            answer[answer.length-1] = num_list[leng-1] - num_list[leng-2];
        }else{
            answer[answer.length-1] = num_list[leng-1]*2;
        }
        
        return answer;
    }
}