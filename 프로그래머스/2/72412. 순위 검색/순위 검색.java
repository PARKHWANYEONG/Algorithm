import java.util.*;

class Solution {
    public int[] solution(String[] info, String[] query) {
        
        HashMap<String,ArrayList<Integer>> map = new HashMap<>();
        
        for(String i : info){
            String[] data = i.split(" ");
            String[] languages = {data[0],"-"};
            String[] jobs = {data[1],"-"};
            String[] exps = {data[2],"-"};
            String[] foods = {data[3],"-"};
            int score = Integer.parseInt(data[4]);
            
            for(String lang : languages){
                for(String job : jobs){
                    for(String exp : exps){
                        for(String food : foods){
                            String[] keyData = {lang,job,exp,food};
                            String key = String.join(" ",keyData);
                            ArrayList<Integer> scoreList = map.getOrDefault(key,new ArrayList<Integer>());
                            scoreList.add(score);
                            map.put(key,scoreList);
                        }
                    }
                }
            }
        }
        for (ArrayList<Integer> scoreList : map.values()) {
            scoreList.sort(null);
        }
        
        int[] answer = new int[query.length];
        
        for(int i=0; i<query.length; i++){
            String[] data = query[i].split(" and ");
            int score = Integer.parseInt(data[3].split(" ")[1]);
            data[3] = data[3].split(" ")[0];
            String key = String.join(" ",data);
            
            if(map.containsKey(key)){
                ArrayList<Integer> list = map.get(key);
                
                int left = 0;
                int right = list.size();
                
                while(left < right){
                    int mid = (left + right) / 2;
                    if(list.get(mid) >= score){
                        right = mid;
                    }else {
                        left = mid + 1;
                    }
                }
                answer[i] = list.size() - left; 
            }
        }
        return answer;
    }
}