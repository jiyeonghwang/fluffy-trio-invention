package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4900JY {
    static List<String> codeList = Arrays.asList("063", "010", "093", "079", "106", "103", "119", "011", "127", "107");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputList = new ArrayList<>();
        String temp = "";
        while (!(temp = br.readLine()).equals("BYE")) {
            inputList.add(temp);
        }

        for (String s : inputList) {
            int result = 0;
            String[] split = s.split("\\+");
            for (String splitString : split) {
                result += codeToNum(splitString);
            }
            System.out.println(s + NumToCode(result));
        }
    }

    public static int codeToNum(String code) {
        int start = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i+3<=code.length(); i=i+3) {
            String temp = code.substring(i, i+3);
            sb.append(codeList.indexOf(temp));
        }
        return Integer.parseInt(sb.toString());
    }

    public static String NumToCode(int num) {
        StringBuilder sb = new StringBuilder();
        String numString = String.valueOf(num);
        char[] chars = numString.toCharArray();
        for (char c : chars) {
            sb.append(codeList.get(Character.getNumericValue(c)));
        }
        return sb.toString();
    }
}
