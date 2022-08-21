package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main4900JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> numbers = new HashMap<>();
        for(int i=0; i<10; i++){
            switch (i){
                case (0):
                    numbers.put("063", 0);
                    break;
                case(1):
                    numbers.put("010", i);
                    break;
                case (2):
                    numbers.put("093", i);
                    break;
                case(3):
                    numbers.put("079", i);
                    break;
                case (4):
                    numbers.put("106", i);
                    break;
                case(5):
                    numbers.put("103", i);
                    break;
                case (6):
                    numbers.put("119", i);
                    break;
                case(7):
                    numbers.put("011", i);
                    break;
                case (8):
                    numbers.put("127", i);
                    break;
                case(9):
                    numbers.put("107", i);
                    break;
            }
        }
        while (true){
            String testCase = br.readLine();
            if (testCase.equals("BYE")) break;

            String[] testNumbers = testCase.substring(0, testCase.length()-1).split("\\+");
            int[] sumNumbers = new int[2];
            for(int i=0; i<testNumbers.length; i++){
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for(int j=0; j<testNumbers[i].length(); j++){
                    sb1.append(testNumbers[i].charAt(j));
                    if(j%3==2) {
                        sb2.append(numbers.get(sb1.toString()));
                        sb1 = new StringBuilder();
                    }
                }
                sumNumbers[i] = Integer.parseInt(sb2.toString());
            }

            StringBuilder sb = new StringBuilder();
            String sum = String.valueOf(sumNumbers[0] + sumNumbers[1]);
            for(int i=0; i<sum.length(); i++){
                char x = sum.charAt(i);

                for(String key : numbers.keySet()) {
                    if(numbers.get(key).equals(Integer.parseInt(String.valueOf(x)))) {
                        sb.append(key);
                        break;
                    }
                }
            }
            System.out.println(testCase+sb);
        }

    }
}
