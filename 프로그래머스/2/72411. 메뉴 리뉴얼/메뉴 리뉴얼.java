import java.util.*;

class Solution {
    
    HashMap<String,Integer> map = new HashMap<>();
    List<String> answerList = new ArrayList<>();
    
    public String[] solution(String[] orders, int[] course) {
       for(int i=0; i<orders.length; i++){
           char[] charArr = orders[i].toCharArray();
           Arrays.sort(charArr);
           orders[i] = String.valueOf(charArr);
       }
        
        for(int courseLength : course){
            for(String order : orders){
                combination("",order,courseLength);
            }
            if(!map.isEmpty()){
                List<Integer> countList = new ArrayList<>(map.values());
                int max = Collections.max(countList);
                if(max > 1){
                    for(String key : map.keySet()){
                        if(map.get(key) == max){
                            answerList.add(key);
                        }
                    }
                }
            }
            System.out.println(map.toString());
            map.clear();
        }
        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
    
    public void combination(String order, String orders, int count){
        if(count == 0){
            map.put(order,map.getOrDefault(order,0) + 1);
            return;
        }
        
        for(int i=0; i<orders.length(); i++){
            combination(order+orders.charAt(i) ,orders.substring(i+1), count-1);
        }
    }
}