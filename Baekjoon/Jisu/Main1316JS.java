package Jisu;

import java.util.*;

public class Main1316JS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] strArray = new String[num];

        for (int i = 0; i<num; i++){
            strArray[i] = scanner.next();
        }

        int answer = 0;
        boolean[] alphabets = new boolean[26];
        boolean flag = true;
        char prev = 'a';
        for(String str: strArray){
            char[] charArray = str.toCharArray();

            for (char x: charArray){
                if (alphabets[x-'a']){
                    if (prev != x){
                        flag = false;
                        break;
                    }
                }
                else{
                    alphabets[x-'a'] = true;
                }
                prev = x;
            }


            if (flag) answer++;
            alphabets = new boolean[26];
            flag = true;
        }
        System.out.println(answer);
    }
}
