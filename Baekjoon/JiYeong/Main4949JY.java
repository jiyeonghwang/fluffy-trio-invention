package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main4949JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack();
        boolean answer = true;
        String temp = "";
        while(!(temp=br.readLine()).equals(".")) {
            for(int i=0; i<temp.length(); i++) {
                String s = String.valueOf(temp.charAt(i));
                if (s.equals("(")) {
                    stack.push(temp.charAt(i));
                } else if (s.equals("[")) {
                    stack.push(temp.charAt(i));
                } else if (s.equals(")")) {
                    if (!stack.empty()) {
                        if (stack.peek() != '(') {
                            answer = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    } else {
                        answer = false;
                        break;
                    }
                } else if (s.equals("]")) {
                    if (!stack.empty()) {
                        if (stack.peek() != '[') {
                            answer = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    } else {
                        answer = false;
                        break;
                    }
                }
            }
            if (stack.empty() && answer) sb.append("yes" + "\n");
            else sb.append("no" + "\n");
            stack.clear();
            answer = true;
        }
        System.out.println(sb);
    }
}
