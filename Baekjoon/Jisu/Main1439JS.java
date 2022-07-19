package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1439JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        List<String> zeros = new ArrayList<>();
        List<String> ones = new ArrayList<>();

        int zero = 0, one = 0;
        boolean isDiff;
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<s.length(); i++){
            char prev = s.charAt(i - 1);
            char current = s.charAt(i);

            if (prev=='0') zero+=1;
            else one +=1;

            isDiff = prev != current;
            sb.append(prev);
            if(isDiff) {
                if (zero > 0) {
                    zeros.add(sb.toString());
                    zero = 0;
                }
                else if (one > 0) {
                    ones.add(sb.toString());
                    one = 0;
                }
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0){
            if (zero > 0) {
                zeros.add(sb.toString());
            }
            else if (one > 0) {
                ones.add(sb.toString());
            }
        } else{
            char last = s.charAt(s.length()-1);
            if (last == '0') zeros.add(sb.append(last).toString());
            else ones.add(sb.append(last).toString());
        }
        int answer = Math.min(zeros.size(), ones.size());
        System.out.println(answer);
    }
}
