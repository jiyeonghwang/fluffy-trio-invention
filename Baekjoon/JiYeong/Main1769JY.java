package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1769JY {
    static int count = 1;
    public void solution (String s) {
        char[] c = s.toCharArray();
        int temp = 0;

        for (char x: c) {
            temp += Integer.parseInt(String.valueOf(x));
        }

        if (temp/10 >= 1) {
            count++;
            this.solution(String.valueOf(temp));
        } else {
            if(temp%3 == 0) {
                System.out.println(count);
                System.out.println("YES");
            } else {
                System.out.println(count);
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();

        if(in.length() == 1) {
            int temp = Integer.parseInt(in);
            if(temp%3 == 0) {
                System.out.println(0);
                System.out.println("YES");
            }else{
                System.out.println(0);
                System.out.println("NO");
            }
        } else {
            Main1769JY main = new Main1769JY();
            main.solution(in);
        }
    }
}
