package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main2535JY {
    public static class Score implements Comparable<Score>{
        int country;
        int student;
        int score;

        public Score(int country, int student, int score) {
            this.country = country;
            this.student = student;
            this.score = score;
        }

        @Override
        public int compareTo(Score o) {
            if (this.score < o.score) {
                return 1;
            }

            return -1;
        }

        @Override
        public String toString() {
            return this.country + " " + this.student;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Score> scores = new ArrayList<>();

        for (int i=0; i<count; i++) {
            String[] input = br.readLine().split(" ");
            Score score = new Score(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            scores.add(score);
        }

        Collections.sort(scores);
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (Score s : scores) {
            if (map.containsKey(s.country)) {
                if (map.get(s.country) < 2) {
                    result++;
                    map.put(s.country, map.get(s.country)+1);
                    System.out.println(s.toString());
                } else {
                    continue;
                }
            } else {
                result++;
                map.put(s.country, 1);
                System.out.println(s.toString());
            }

            if (result == 3) break;
        }
    }
}
