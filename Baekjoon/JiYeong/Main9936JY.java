package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main9936JY {
    static String str;
    static String boomStr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        boomStr = br.readLine();
        // End of input

        String res = search();
        System.out.println((res.length() == 0) ? "FRULA" : res);
        br.close();
    }

    private static String search() {
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> tempStack = new Stack<Character>();

        List<Character> boomArr = new ArrayList<Character>();
        for (int i = 0; i < boomStr.length(); i++) {
            boomArr.add(boomStr.charAt(boomStr.length() - i - 1));
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            stack.push(c);

            if (c == boomArr.get(0) && stack.size() >= boomStr.length()) {

                tempStack.clear();
                for (char target : boomArr) {
                    char temp = stack.pop();
                    tempStack.push(temp);

                    if (target != temp) {
                        while (!tempStack.isEmpty()) {
                            stack.push(tempStack.pop());
                        }
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        return sb.toString();
    }
}
