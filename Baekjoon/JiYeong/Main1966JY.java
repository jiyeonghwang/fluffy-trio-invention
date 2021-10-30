package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class Main1966JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] s = null;
        int doc=0, target=0, lt=0;
        ArrayList<Integer> list = new ArrayList();
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<cnt; i++) {
            s = br.readLine().split(" ");
            doc = Integer.parseInt(s[0]);
            target = Integer.parseInt(s[1]);

            s = br.readLine().split(" ");
            queue.clear();
            list.clear();
            for (int j=0; j<doc; j++) {
                queue.add(j);
                list.add(Integer.parseInt(s[j]));
            }

            Collections.sort(list);
            Collections.reverse(list);
            while (!queue.isEmpty()) {
                if (Integer.parseInt(s[queue.peek()])==list.get(lt)) {
                    lt++;
                    if (queue.peek() == target) {
                        break;
                    } else {
                        queue.add(queue.peek());
                        queue.poll();
                    }
                } else {
                    queue.add(queue.peek());
                    queue.poll();
                }
            }
            System.out.println(lt);
            lt = 0;
        }
    }
}
