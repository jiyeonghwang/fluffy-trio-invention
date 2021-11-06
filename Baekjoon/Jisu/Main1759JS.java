package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1759JS {
    public static int password;
    public static char[] answer;
    public static char[] alphabets;
    // consonant: 자음, vowel: 모음
    public static void recursive(int level, int count, int consonant, int vowel){
        if (count == password){
            if (consonant >=2 && vowel >=1) {
                for (char x : answer) System.out.print(x);
                System.out.println();
            }
            return;
        }
        else{
            for (int i=level; i<alphabets.length; i++) {
                answer[count] = alphabets[i];
                if (alphabets[i] == 'a' || alphabets[i] == 'e' || alphabets[i] == 'i' || alphabets[i] == 'o' || alphabets[i] == 'u') {
                    recursive(i + 1, count + 1, consonant, vowel + 1);

                } else {
                    recursive(i + 1, count+1, consonant + 1, vowel);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        password = Integer.parseInt(st.nextToken());
        int totalKind = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        StringBuilder alphabetStr = new StringBuilder();
        for(int i=0; i<totalKind; i++) alphabetStr.append(st.nextToken());

        alphabets = alphabetStr.toString().toCharArray();
        answer = new char[password];
        Arrays.sort(alphabets);
        recursive(0, 0, 0, 0);
    }
}
