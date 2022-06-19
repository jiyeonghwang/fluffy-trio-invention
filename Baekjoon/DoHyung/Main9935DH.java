package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main9935DH {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();
        for (int i=0;i<str.length();i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= bomb.length()) {
                boolean isSame = true;
                int startIdx = stack.size()-bomb.length();

                for (int j=startIdx;j<stack.size();j++) {
                    if (stack.get(j) != bomb.charAt(j-startIdx)) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    for (int j=0;j<bomb.length();j++) {
                        stack.pop();
                    }
                }
            }

        }

        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();
            for (char ch : stack)
                sb.append(ch);
            System.out.println(sb);
        }
    }
}
