package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main14584DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i=0;i<n;i++) {
            words[i] = br.readLine();
        }


        boolean found = false;
        String newStr = null;

        for (int i=0;i<26;i++) {
            if (found) {
                break;
            }

            for (int j=0;j<str.length;j++) {
                str[j]+=1;

                if (str[j]>122) {
                    str[j]-=26;
                }
            }

            newStr=String.valueOf(str);

            for (String word:words) {
                if (newStr.contains(word)) {
                    found=true;
                    break;
                }
            }
        }

        System.out.println(newStr);
    }
}