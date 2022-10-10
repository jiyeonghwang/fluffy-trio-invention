package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main13414DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nOfStudents = Integer.parseInt(st.nextToken());
        int nOfQueue = Integer.parseInt(st.nextToken());

        String[] queue = new String[nOfQueue];

        for (int i=0;i<nOfQueue;i++) {
            queue[i] = br.readLine();
        }

        Set<String> linkedHashSet = new LinkedHashSet<>();

        for (int i=nOfQueue-1;i>=0;i--) {
            linkedHashSet.add(queue[i]);
        }

        String[] result = linkedHashSet.toArray(new String[linkedHashSet.size()]);

        StringBuilder sb = new StringBuilder();
        int index = (result.length-nOfStudents)<0?0:(result.length-nOfStudents);

        for (int i=result.length-1;i>=index;i--) {
            sb.append(result[i]+"\n");
        }

        System.out.println(sb);
    }
}
