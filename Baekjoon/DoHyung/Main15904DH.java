package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main15904DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        char[] abbreviation = {'U','C','P','C'};
        int index = 0;

        for (int i=0;i<input.length;i++) {
            if (abbreviation[index] == input[i]) {
                index++;
            }

            if (index == abbreviation.length) {
                break;
            }
        }

        if (index == abbreviation.length) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}

