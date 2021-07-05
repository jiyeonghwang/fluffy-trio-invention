package Jisu;

import java.io.*;

public class Main14584JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] code = br.readLine().toCharArray();
        int num = Integer.parseInt(br.readLine());

        String[] dictArray = new String[num];
        String answer = "";
        boolean flag = false;

        for (int i = 0; i<num; i++){
            dictArray[i] = br.readLine();
        }

        for (int i = 0; i<26; i++){
            if (flag) break;
            for (int j = 0; j<code.length; j++){
                code[j]+=1;
                if (code[j]>122){
                    code[j]-=26;
                }
            }
            answer = String.valueOf(code);
            for(String dict:dictArray){
                if (answer.contains(dict)) {
                    flag = true;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}

