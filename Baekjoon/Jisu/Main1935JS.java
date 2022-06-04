package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1935JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] expression = br.readLine().toCharArray();
        double[] doubles = new double[n];
        for(int i=0; i<n; i++){
            doubles[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();
        for (char x : expression) {
            if (Character.isAlphabetic(x)) stack.push(doubles[x - 'A']);
            else {
                if (!stack.isEmpty()) {
                    double b = stack.pop();
                    double a = stack.pop();
                    switch (x) {
                        case '+':
                            stack.push(a + b);
                            break;
                        case '*':
                            stack.push(a * b);
                            break;
                        case '-':
                            stack.push(a - b);
                            break;
                        case '/':
                            stack.push(a / b);
                            break;
                    }
                }
            }
        }
        System.out.printf("%.2f%n", stack.pop());
    }
}
