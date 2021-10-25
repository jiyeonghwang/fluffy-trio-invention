package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main4779DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Iterator<String> input = br.lines().iterator();

        StringBuilder sb = new StringBuilder();
        while(input.hasNext()) {
            double exp = Double.parseDouble(input.next());
            int n = Double.valueOf(Math.pow(3, exp)).intValue();

            boolean[] str = new boolean[n];
            str = cantor(0, n, str);

            for (int i=0;i<n;i++) {
                if (str[i]) {
                    sb.append(" ");
                } else {
                    sb.append("-");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static boolean[] cantor(int start, int end, boolean[] str) {
        int cutLength = (end-start)/3;
        for (int i=start+cutLength;i<start+cutLength*2;i++) {
            str[i] = true;
        }

        if (cutLength <= 1) {
            return str;
        }

        str = cantor(start, start+cutLength, str);
        str = cantor(start+cutLength*2, end, str);

        return str;
    }
}
