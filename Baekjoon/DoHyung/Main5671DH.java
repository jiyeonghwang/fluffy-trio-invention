package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main5671DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Iterator<String> iter = br.lines().iterator();
        while (iter.hasNext()) {
            StringTokenizer st = new StringTokenizer((String) iter.next());
            int min = Integer.parseInt(st.nextToken());
            int max = Integer.parseInt(st.nextToken());

            sb.append(findRoomNumber(min, max)).append(" ");
        }

        System.out.println(sb);
    }

    public static int findRoomNumber(int min, int max) {
        int count = 0;

        int[] numbers = new int[10];
        boolean dup = false;
        for (int i=min;i<=max;i++) {
            String str = String.valueOf(i);
            numbers = new int[10];
            dup = false;
            for (int j=0;j<str.length();j++) {
                if (numbers[str.charAt(j)-'0'] == 0) {
                    numbers[str.charAt(j)-'0']++;
                } else {
                    dup = true;
                    break;
                }
            }

            if (!dup) {
                count++;
            }
        }

        return count;
    }
}
