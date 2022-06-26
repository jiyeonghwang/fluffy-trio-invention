package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1254DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i=0;i<input.length();i++) {
            if (isPalindrome(input.substring(i))) {
                System.out.println(input.length()+i);
                return;
            }
        }

        System.out.println(input.length()*2-1);
    }

    public static boolean isPalindrome(String str) {
        int middle = str.length()/2;

        for (int i=0;i<middle;i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }

        return true;
    }
}

