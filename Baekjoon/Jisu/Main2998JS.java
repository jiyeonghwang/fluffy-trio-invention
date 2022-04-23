package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2998JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder zeroFill = new StringBuilder(input);
        int len = input.length();
        while(len%3 != 0){
            zeroFill.insert(0, "0");
            len+=1;
        }

        StringBuilder split = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<zeroFill.length(); i++){
            split.append(zeroFill.charAt(i));
            if(i%3 == 2) {
                switch (split.toString()) {
                    case "000":
                        answer.append("0");
                        break;
                    case "001":
                        answer.append("1");
                        break;
                    case "010":
                        answer.append("2");
                        break;
                    case "011":
                        answer.append("3");
                        break;
                    case "100":
                        answer.append("4");
                        break;
                    case "101":
                        answer.append("5");
                        break;
                    case "110":
                        answer.append("6");
                        break;
                    case "111":
                        answer.append("7");
                        break;
                }

                split = new StringBuilder();
            }
        }
        System.out.println(answer);
    }
}
