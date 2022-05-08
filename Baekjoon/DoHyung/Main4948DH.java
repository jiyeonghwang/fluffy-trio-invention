package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4948DH {
    private static boolean[] notPrime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        checkPrime();

        StringBuilder sb = new StringBuilder();
        while (!(input=br.readLine()).equals("0")) {
            int num = Integer.parseInt(input);

            int count = 0;
            for (int i=num+1;i<=num*2;i++) {
                if (!notPrime[i]) {
                    count++;
                }
            }

            sb.append(count+"\n");
        }

        System.out.println(sb);
    }

    public static void checkPrime() {
        notPrime[0] = notPrime[1] = true;

        for (int i=2;i<=Math.sqrt(notPrime.length);i++) {
            if (notPrime[i]) {
                continue;
            }

            for (int j=i*i;j<notPrime.length;j+=i){
                notPrime[j] = true;
            }
        }
    }
}

