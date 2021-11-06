package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1759DH {
    private static int length = 0;
    private static int n = 0;
    private static String[] alphabets;

    private static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        length = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        alphabets = new String[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<alphabets.length;i++) {
            alphabets[i] = st.nextToken();
        }

        Arrays.sort(alphabets);

        backTracking(0, "", 0, 0);

        System.out.println(answer);
    }

    public static void backTracking(int position, String str, int con, int vow) {
        if (str.length() == length) {
            if (con >= 2 && vow >= 1) {
                answer.append(str).append("\n");
            }
            return;
        }

        for (int i=position;i<n;i++) {
            if (alphabets[i].equals("a") || alphabets[i].equals("e") || alphabets[i].equals("i") || alphabets[i].equals("o") || alphabets[i].equals("u")) {
                backTracking(i+1, str+alphabets[i], con, vow+1);
            } else {
                backTracking(i+1, str+alphabets[i], con+1, vow);
            }
        }
    }
}
