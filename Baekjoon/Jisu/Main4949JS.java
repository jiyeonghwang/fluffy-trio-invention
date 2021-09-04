package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main4949JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            String answer = "yes";
            for (char x : input.toCharArray()) {
                if (x == '(' || x == '[') stack.push(x);
                else if (x == ')') {
                    if (!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else answer = "no";
                }
                else if (x == ']') {
                    if (!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else answer = "no";
                }
            }
            if (!stack.isEmpty()) answer = "no";
            System.out.println(answer);
        }
    }
}
