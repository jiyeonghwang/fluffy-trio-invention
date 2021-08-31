package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main4949DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String tmp = null;
        while (!(tmp=br.readLine()).equals(".")) {
            list.add(tmp);
        }

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        boolean isBalanced = true;
        for (String s:list) {
            stack = new Stack<Character>();
            isBalanced = true;

            for (Character c:s.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            }

            if (stack.isEmpty() && isBalanced) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);
    }
}
