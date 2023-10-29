import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        HashMap<String,HashSet<String>> 신고명단 = new HashMap<>();
        HashMap<String,HashSet<String>> 신고당한명단 = new HashMap<>();
        
        for(String r : report){
            String[] arr = r.split(" ");
            String 신고한사람 = arr[0];
            String 신고당한사람 = arr[1];
            
            if(!신고명단.containsKey(신고한사람)){
                신고명단.put(신고한사람,new HashSet<>());
            }
            신고명단.get(신고한사람).add(신고당한사람);
            
            if(!신고당한명단.containsKey(신고당한사람)){
                신고당한명단.put(신고당한사람,new HashSet<>());
            }
            신고당한명단.get(신고당한사람).add(신고한사람);
        }
        
        int[] answer = new int[id_list.length];
        
        for(int i=0; i<id_list.length; i++){
            if(신고명단.containsKey(id_list[i])){
                HashSet<String> 신고당한사람들 = 신고명단.get(id_list[i]);
                for(String 신고당한사람 : 신고당한사람들){
                    if(신고당한명단.get(신고당한사람).size() >= k){
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
}