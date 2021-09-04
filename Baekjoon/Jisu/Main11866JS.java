package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main11866JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i<total; i++){
            queue.add(i+1);
        }

        while (!queue.isEmpty()){
            for (int j = 0; j<target-1; j++){
                int poll = queue.poll();
                queue.add(poll);
            }
            int remove = queue.poll();
            sb.append(remove);
            if (queue.size() > 0){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
