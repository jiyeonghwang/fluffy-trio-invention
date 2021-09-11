package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main10866JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int temp = 0;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue q = new LinkedList<Integer>();
        for(int i=1; i<cnt+1; i++){
            q.add(i);
        }

        while(!q.isEmpty()){
            if (temp<num-1) {
                q.add(q.peek());
                q.poll();
                temp++;
            } else if (temp==num-1){
                sb.append(q.peek());
                q.poll();
                if(!q.isEmpty()) sb.append(", ");
                temp=0;
            }
        }
        System.out.println(sb+">");
    }
}