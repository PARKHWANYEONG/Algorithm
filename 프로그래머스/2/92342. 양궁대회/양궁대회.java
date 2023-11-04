import java.util.*;

class Solution {
    public int[] solution(int n, int[] info) {
        int[] answer = new int[11];
        int[] temp = new int[11];
        int max = 0;
        
        for(int subset = 1; subset < (1 << 10); subset++){
            int ryan = 0, apeach = 0,cnt = 0; 
            
            for(int i=0; i<10; i++){
                if((subset & (1 << i)) != 0){
                    ryan += 10 - i;
                    temp[i] = info[i]+1;
                    cnt += temp[i];
                }else{
                    temp[i] = 0;
                    if(info[i] > 0){
                        apeach += 10 - i;
                    }
                }
            }
            
            if(cnt > n) continue;
            
            temp[10] = n - cnt;
            
            if(ryan - apeach == max){
                for(int i=10; i>=0; i--){
                    if(temp[i] > answer[i]){
                        answer = Arrays.copyOf(temp,temp.length);
                        break;
                    }else if(temp[i] < answer[i]){
                        break;
                    }
                    continue;
                }
            }
            
            if(ryan - apeach > max){
                max = ryan - apeach;
                answer = Arrays.copyOf(temp,temp.length);
            }
        }
        
        if(max == 0){
            return new int[]{-1};
        }
        
        return answer;
    }
}