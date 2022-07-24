package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1439DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char current = input.charAt(0);
        char first = input.charAt(0);
        int diffCount = 0;
        for (int i=1;i<input.length();i++) {
            if (input.charAt(i) != current) {
                if (input.charAt(i) != first) {
                    diffCount++;
                }
                current = input.charAt(i);
            }
        }

        System.out.println(diffCount);
    }
}
