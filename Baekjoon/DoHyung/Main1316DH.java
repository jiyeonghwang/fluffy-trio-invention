package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1316DH {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i=0;i<n;i++) {
            words[i] = br.readLine();
        }

        int count = 0;
        char previous = 'A';
        boolean isBlockWord = true;
        boolean[] alphabets = new boolean[26];
        for (String word:words) {
            char[] letters = word.toCharArray();
            for (char letter:letters) {
                if (alphabets[letter-'a']) {
                    if (letter != previous) {
                        isBlockWord = false;
                        break;
                    }
                } else {
                    alphabets[letter-'a'] = true;
                }

                previous = letter;
            }

            if (isBlockWord) {
                count++;
            }

            isBlockWord = true;
            alphabets = new boolean[26];
        }

        System.out.println(count);
    }
}
