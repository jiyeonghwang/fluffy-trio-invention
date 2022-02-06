import java.io.*;
import java.util.*;


public class Solution {
    public static String upperCaseFirst(String s) {
        char[] arr = s.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }

    public static String lowerCaseFirst(String s) {
        char[] arr = s.toCharArray();
        arr[0] = Character.toLowerCase(arr[0]);
        return new String(arr);
    }

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input=br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input, ";");

            String operation = st.nextToken();
            String to = st.nextToken();
            String str = st.nextToken();
            String result = "";

            /*
             * operation case
             * S: split
             * C: combine
             *
             * to case
             * M: method
             * C: Class
             * V: variable
             * */
            char[] tempStr = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            if ("S".equals(operation)) {
                for (char c : tempStr) {
                    if (c == '(' || c == ')') {
                        continue;
                    } else if (c >= 'a') {//???
                        sb.append(c);
                    } else {//???
                        sb.append(" " + lowerCaseFirst(String.valueOf(c)));
                    }

                    result = sb.toString();
                    if (result.substring(0, 1).equals(" ")) result = result.substring(1, result.length());
                }
            } else if ("C".equals(operation)) {
                String[] temp = str.split(" ");
                for (String s : temp) {
                    sb.append(upperCaseFirst(s));
                }

                if ("M".equals(to)) {
                    sb.append("()");
                    result = lowerCaseFirst(sb.toString());
                } else if ("C".equals(to)) {
                    result = upperCaseFirst(sb.toString());
                } else if ("V".equals(to)) {
                    result = lowerCaseFirst(sb.toString());
                }
            }

            System.out.println(result);
        }
    }
}
