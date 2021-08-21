package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1357JY {
    public int Solution (String s) {
        StringBuilder sb = new StringBuilder(s);
        return  Integer.parseInt(sb.reverse().toString());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        Main1357JY main = new Main1357JY();
        System.out.println(main.Solution(String.valueOf(main.Solution(a)+main.Solution(b))));
    }
}
