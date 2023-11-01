import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String ,Integer> intime = new HashMap<>();
        TreeMap<String ,Integer> result = new TreeMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            if (split[2].equals("IN")) {
                intime.put(split[1], convert(split[0]));
                if (!result.containsKey(split[1])) {
                    result.put(split[1], 0);
                }
            } else {
                int overTime = convert(split[0]) - intime.get(split[1]);
                result.put(split[1], result.get(split[1]) + overTime);
                intime.remove(split[1]);
            }
        }

        intime.forEach((key, val) -> {
            result.put(key, result.get(key) + convert("23:59") - val);
        });

        List<Integer> answerList = new ArrayList<>();

        for (String key : result.keySet()) {
            Integer overTime = result.get(key);
            if (overTime > fees[0]) {
                int price = (int) Math.ceil((double) (overTime - fees[0]) / fees[2]) * fees[3] + fees[1];
                answerList.add(price);
            } else {
                answerList.add(fees[1]);
            }
        }
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private Integer convert(String s) {
        String[] split = s.split(":");
        return Integer.parseInt(split[0])* 60  + Integer.parseInt(split[1]);
    }
}