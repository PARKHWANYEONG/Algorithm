import java.util.*;

class Solution { 
public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<String,Integer> genresPlayNum = new HashMap<>();
        HashMap<String,HashMap<Integer,Integer>> music = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (!genresPlayNum.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                genresPlayNum.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                genresPlayNum.put(genres[i], genresPlayNum.get(genres[i]) + plays[i]);
            }
        }

        List<String> genresKey = new ArrayList<>(genresPlayNum.keySet());
        Collections.sort(genresKey,(k1,k2)-> genresPlayNum.get(k2) - genresPlayNum.get(k1));


        for (String genreKey : genresKey) {
            HashMap<Integer, Integer> playNum = music.get(genreKey);
            List<Integer> musicKeys = new ArrayList<>(playNum.keySet());
            Collections.sort(musicKeys,(m1,m2)-> playNum.get(m2) - playNum.get(m1));

            answer.add(musicKeys.get(0));

            if (musicKeys.size() > 1) {
                answer.add(musicKeys.get(1));
            }

        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}