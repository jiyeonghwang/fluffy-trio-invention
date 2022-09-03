package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main4900DH {
    private static final Map<String, String> map = new HashMap<String, String>() {{
        put("063","0");
        put("010","1");
        put("093","2");
        put("079","3");
        put("106","4");
        put("103","5");
        put("119","6");
        put("011","7");
        put("127","8");
        put("107","9");
        put("0","063");
        put("1","010");
        put("2","093");
        put("3","079");
        put("4","106");
        put("5","103");
        put("6","119");
        put("7","011");
        put("8","127");
        put("9","107");
    }};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        StringBuilder sb = new StringBuilder();

        while (!"BYE".equals(input = br.readLine())) {
            String[] splited = input.substring(0,input.length()-1).split("\\+");
            String num1 = "";

            for (int i=0;i<splited[0].length();i+=3) {
                num1 += map.get(splited[0].substring(i,i+3));
            }

            String num2 = "";
            for (int i=0;i<splited[1].length();i+=3) {
                num2 += map.get(splited[1].substring(i,i+3));
            }

            String newNum = String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
            String answer = "";
            for (int i=0;i<newNum.length();i++) {
                answer += map.get(String.valueOf(newNum.charAt(i)));
            }

            sb.append(input+answer+"\n");
        }

        System.out.println(sb);
    }
}
