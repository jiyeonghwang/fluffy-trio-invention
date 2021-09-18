package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1966DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int j=0;j<t;j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Queue<Patient> line = new LinkedList<Patient>();
            for (int i=0;i<n;i++) {
                line.add(new Patient(Integer.parseInt(st.nextToken()), i));
            }

            int count = 0;
            while (true) {
                Patient now = line.poll();
                int max = now.getPriority();
                Iterator<Patient> iter = line.iterator();
                while (iter.hasNext()) {
                    Patient tmp = iter.next();
                    if (tmp.getPriority() > max) {
                        max = tmp.getPriority();
                    }
                }

                if (now.getPriority() != max) {
                    line.add(now);
                    while (line.peek().getPriority() != max) {
                        line.add(line.poll());
                    }
                    now = line.poll();
                }

                count++;
                if (now.getNumber() == m) {
                    break;
                }
            }
            sb.append(count).append("\n");
        }



        System.out.println(sb);
    }
}

class Patient {
    private int priority;
    private int number;

    public Patient(int priority, int number) {
        super();
        this.priority = priority;
        this.number = number;
    }

    public int getPriority() {
        return priority;
    }

    public int getNumber() {
        return number;
    }
}
