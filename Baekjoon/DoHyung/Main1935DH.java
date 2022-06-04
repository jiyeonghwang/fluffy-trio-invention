package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1935DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        double[] nums = new double[n];
        for (int i=0;i<n;i++) {
            nums[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<Double>();
        for (int i=0;i<input.length();i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                stack.push(nums[c-'A']);
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                if (c == '+') {
                    stack.push(num2+num1);
                } else if (c == '-') {
                    stack.push(num2-num1);
                } else if (c == '*') {
                    stack.push(num2*num1);
                } else if (c == '/') {
                    stack.push(num2/num1);
                }
            }
        }

        System.out.println(String.format( "%.2f", stack.pop()));
    }
}