package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1966JS {
    static class printDocument{
        int idx;
        int priority;
        public printDocument(int idx, int priority){
            this.idx = idx;
            this.priority = priority;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testNum = Integer.parseInt(br.readLine());
        Queue<printDocument> queue = new LinkedList<>();
        for (int i =0; i<testNum; i++){
            st = new StringTokenizer(br.readLine());
            int docNum = Integer.parseInt(st.nextToken());
            int targetDoc = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<docNum; j++){
                printDocument doc = new printDocument(j, Integer.parseInt(st.nextToken()));
                queue.add(doc);
            }

            int count = 0;
            while (!queue.isEmpty()) {
                printDocument innerDoc = queue.poll();
                boolean flag = true;
                for (printDocument doc : queue) {
                    if (doc.priority > innerDoc.priority) {
                        queue.add(innerDoc);
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    count+=1;
                    if (innerDoc.idx == targetDoc) System.out.println(count);
                }
            }
        }
    }
}
