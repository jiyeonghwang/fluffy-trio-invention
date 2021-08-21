package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main2075JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<cnt; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<cnt; j++) {
                q.offer(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i=0; i<cnt-1; i++) {
            q.poll();
        }

        System.out.println(q.poll());
    }
}
