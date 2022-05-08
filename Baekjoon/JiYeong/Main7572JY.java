package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main7572JY {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (input < 4) input = input + 56;
        else input = input-4;

        int gan = input % 10;
        int ji = (input % 12) + 65;
        char jiToChar = (char) ji;

        StringBuilder sb = new StringBuilder();
        sb.append(jiToChar);
        sb.append(gan);

        System.out.println(sb.toString());
    }
}
