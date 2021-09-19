package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main17952JS {
    static class Homework{
        int score;
        int requireTime;
        public Homework(int score, int requireTime){
            this.score = score;
            this.requireTime = requireTime;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int totalTime = Integer.parseInt(br.readLine());
        Stack<Homework> stack = new Stack<>();

        int answer = 0;
        for (int i =0; i<totalTime; i++){
            st = new StringTokenizer(br.readLine());
            int minutes = Integer.parseInt(st.nextToken());
            if (minutes >0) {
                int score = Integer.parseInt(st.nextToken());
                int requireTime = Integer.parseInt(st.nextToken());
                if (requireTime == 1) answer += score;
                else {
                    Homework homework = new Homework(score, requireTime-1);
                    stack.push(homework);
                }
            } else if (!stack.isEmpty()){
                Homework homework = stack.pop();
                if (homework.requireTime-1 == 0) answer += homework.score;
                else {
                    Homework tmp = new Homework(homework.score, homework.requireTime-1);
                    stack.push(tmp);
                }
            }
        }
        System.out.println(answer);
    }
}
