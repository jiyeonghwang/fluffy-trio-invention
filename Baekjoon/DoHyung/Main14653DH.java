package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14653DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nOfPeople = Integer.parseInt(st.nextToken());
        int nOfTexts = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken())-1;

        int[] count = new int[nOfTexts];
        int[] sender = new int[nOfTexts];
        for (int i=0;i<nOfTexts;i++) {
            st = new StringTokenizer(br.readLine());
            count[i] = Integer.parseInt(st.nextToken());
            sender[i] = st.nextToken().charAt(0)-'A';
        }

        if (count[target] == 0) {
            System.out.println(-1);
            return;
        }

        //people who sent texts after target must read
        boolean[] read = new boolean[nOfPeople];
        for (int i=target;i<nOfTexts;i++) {
            read[sender[i]] = true;
        }

        //check for the same count
        for (int i=target;i>=1;i--) {
            if (count[i] == count[i-1] ) {
                read[sender[i]] = true;
                read[sender[i-1]] = true;
            } else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1;i<nOfPeople;i++) {
            if (!read[i]) {
                sb.append((char) (i+'A')).append(" ");
            }
        }

        System.out.println(sb);
    }
}
